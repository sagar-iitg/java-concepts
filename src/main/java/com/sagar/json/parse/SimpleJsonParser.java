import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleJsonParser {

    private String json;
    private int index;
    private int length;

    public SimpleJsonParser(String json) {
        this.json = json;
        this.index = 0;
        this.length = json.length();
    }

    public Object parse() {
        skipWhitespace();
        char currentChar = peek();
        if (currentChar == '{') {
            return parseObject();
        } else if (currentChar == '[') {
            return parseArray();
        } else if (currentChar == '"') {
            return parseString();
        } else if (Character.isDigit(currentChar) || currentChar == '-') {
            return parseNumber();
        } else if (currentChar == 't' || currentChar == 'f') {
            return parseBoolean();
        } else if (currentChar == 'n') {
            return parseNull();
        } else {
            throw new IllegalStateException("Unexpected character: " + currentChar);
        }
    }

    private Object parseObject() {
        expect('{');
        Map<String, Object> object = new HashMap<>();
        while (peek() != '}') {
            skipWhitespace();
            String key = parseString();
            skipWhitespace();
            expect(':');
            skipWhitespace();
            Object value = parse();
            object.put(key, value);
            skipWhitespace();
            if (peek() == ',') {
                next(); // Consume the comma
            }
        }
        expect('}');
        return object;
    }

    private Object parseArray() {
        expect('[');
        List<Object> array = new ArrayList<>();
        while (peek() != ']') {
            skipWhitespace();
            array.add(parse());
            skipWhitespace();
            if (peek() == ',') {
                next(); // Consume the comma
            }
        }
        expect(']');
        return array;
    }

    private String parseString() {
        expect('"');
        StringBuilder sb = new StringBuilder();
        while (peek() != '"') {
            char c = next();
            if (c == '\\') {
                char escape = next();
                switch (escape) {
                    case '"':
                    case '\\':
                    case '/':
                        sb.append(escape);
                        break;
                    case 'b':
                        sb.append('\b');
                        break;
                    case 'f':
                        sb.append('\f');
                        break;
                    case 'n':
                        sb.append('\n');
                        break;
                    case 'r':
                        sb.append('\r');
                        break;
                    case 't':
                        sb.append('\t');
                        break;
                    case 'u':
                        String unicode = json.substring(index, index + 4);
                        sb.append((char) Integer.parseInt(unicode, 16));
                        index += 4;
                        break;
                    default:
                        throw new IllegalStateException("Invalid escape character: \\" + escape);
                }
            } else {
                sb.append(c);
            }
        }
        expect('"');
        return sb.toString();
    }

    private Number parseNumber() {
        StringBuilder sb = new StringBuilder();
        while (isDigitOrDot(peek())) {
            sb.append(next());
        }
        String numStr = sb.toString();
        if (numStr.contains(".")) {
            return Double.parseDouble(numStr);
        } else {
            return Long.parseLong(numStr);
        }
    }

    private Boolean parseBoolean() {
        if (next() == 't') {
            expect("rue");
            return true;
        } else {
            expect("alse");
            return false;
        }
    }

    private Object parseNull() {
        expect("null");
        return null;
    }

    private void expect(char expected) {
        char actual = next();
        if (actual != expected) {
            throw new IllegalStateException("Expected '" + expected + "' but got '" + actual + "'");
        }
    }

    private void expect(String expected) {
        for (int i = 0; i < expected.length(); i++) {
            expect(expected.charAt(i));
        }
    }

    private void skipWhitespace() {
        while (index < length && Character.isWhitespace(json.charAt(index))) {
            index++;
        }
    }

    private char peek() {
        skipWhitespace();
        return json.charAt(index);
    }

    private char next() {
        skipWhitespace();
        if (index >= length) {
            throw new IllegalStateException("Unexpected end of input");
        }
        return json.charAt(index++);
    }

    private boolean isDigitOrDot(char c) {
        return Character.isDigit(c) || c == '.';
    }

    // Method to convert parsed JSON object to Map<String, Object>
    public Map<String, Object> toMap(Object jsonObject) {
        if (jsonObject instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> map = (Map<String, Object>) jsonObject;
            Map<String, Object> result = new HashMap<>();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                result.put(entry.getKey(), toMap(entry.getValue()));
            }
            return result;
        } else if (jsonObject instanceof List) {
            @SuppressWarnings("unchecked")
            List<Object> list = (List<Object>) jsonObject;
            List<Object> result = new ArrayList<>();
            for (Object obj : list) {
                result.add(toMap(obj));
            }
            return Map.of("array", result); // Wrap list in a map
        } else {
            // Base case: primitives (String, Number, Boolean, null)
            return jsonObject != null ? Map.of("value", jsonObject) : Map.of("value", null);
        }
    }

    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John Smith\",\"age\":25,\"hobbies\":[\"running\",\"coding\",\"camping\"]}";

        SimpleJsonParser parser = new SimpleJsonParser(jsonString);
        Object parsedJson = parser.parse();

        // Convert parsed JSON to Map<String, Object>
        Map<String, Object> jsonMap = parser.toMap(parsedJson);
        System.out.println(jsonMap);
    }
}
