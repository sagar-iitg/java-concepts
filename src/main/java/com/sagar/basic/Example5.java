package basic;

public class Example5 {

    public static void main(String[] args) {
        System.out.println("inside main");
        fun();
    }
    static void  fun(){
        System.out.println("inside fun");
        String[] arr={"a","b"};
        main(arr);

    }
}
