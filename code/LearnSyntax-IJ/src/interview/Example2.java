package interview;


class A{


    int i=10;

    int getI()
    {
        return i;
    }
    void setI(int i)
    {

        this.i=i;
    }


}
public class Example2 {


    public static void main(String[] args) {

        final A a=new A();

        System.out.println(a.getI());
        a.setI(20);
        System.out.println(a.getI());
       // b=new A();


    }
}
