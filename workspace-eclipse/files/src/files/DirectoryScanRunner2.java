package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner2 {

	public static void main(String[] args) throws IOException {

		Path dir = Paths.get("./resources/data.txt");
		List<String> ll = Files.readAllLines(dir);
		// System.out.println(ll);
		Files.lines(dir).map(String::toLowerCase).filter(str -> str.contains("a")).forEach(System.out::println);

	}

}
