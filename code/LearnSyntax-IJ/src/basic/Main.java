package basic;

public class Main implements A{

    @Override
    public void method() {

        System.out.println("hello method");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.method();
    }
}
