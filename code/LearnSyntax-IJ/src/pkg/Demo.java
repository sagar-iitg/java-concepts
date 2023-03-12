package pkg;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {


        List<String> list=new ArrayList<>();
        list.add("Sagar");

        List anotherList=new ArrayList();
        anotherList.add(2);
        anotherList.add("sk");
        anotherList.add(12.12);

        System.out.println(list);


        System.out.println(anotherList);



    }

    static interface One {
        default void method() {
            System.out.println("Demo.One");
        }
    }
}
