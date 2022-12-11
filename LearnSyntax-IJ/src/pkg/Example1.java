package pkg;


import java.lang.reflect.Method;
import java.util.Arrays;

class Fun{



    public int add(int x,int y)
    {
        return  x+y;

    }
}
public class Example1 {


    public static void main(String[] args) {

        Fun f=new Fun();
        Class c=f.getClass();


        System.out.println(f.getClass());
        System.out.println(c.getName());
        System.out.println(f.add(2,3));
        System.out.println("Hello World");
        System.out.println(Arrays.toString(f.getClass().getMethods()));
        Method[] met=c.getMethods();
        for (Method i:met
             ) {
            System.out.println(i.getName());

        }




    }
}
