package function;

public class IntegerValue {


    public static void main(String[] args) {
        Integer a=new Integer(10);
        change(a);
        System.out.println(a);
        //System.out.println(a.hashCode());
    }

    private static void change(Integer a) {

        a=25;
       // System.out.println(a.hashCode());
    }
}
