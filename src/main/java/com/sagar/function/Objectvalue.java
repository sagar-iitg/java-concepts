package function;

import java.util.Arrays;

public class Objectvalue {


    public static void main(String[] args) {
       Object[] obj=new Object[10];
       obj[0]="string";
       obj[1]=2;
       obj[2]=2.3f;
       change(obj);
        System.out.println(Arrays.toString(obj));


    }

    private static void change(Object[] obj) {
        obj[0]=3;
    }
}
