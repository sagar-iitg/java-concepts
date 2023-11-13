package generic.example1;

import java.util.ArrayList;
import java.util.List;

public class Example {


    public static void main(String[] args) {
//        List l= new ArrayList();
//        l.add("India");
//        String s = (String) l.get(0);     // typecasting
//        System.out.println(s);
        List<String> l = new ArrayList<String>();
        l.add("hello");
        String s = l.get(0);
        System.out.println(s);


    }
}
