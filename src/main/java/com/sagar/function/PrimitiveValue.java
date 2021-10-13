package function;

public class PrimitiveValue {


    public static void main(String[] args) {


        int a=10;
        change(a);
        System.out.println(a);
    }

    private static void change(int a) {
        a=20;
        //System.out.println(a);
    }
}
