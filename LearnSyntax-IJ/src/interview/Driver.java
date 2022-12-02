package interview;

import java.util.HashMap;

public class Driver {


    public static void main(String[] args) {


        final HashMap<Integer, String> h = new HashMap<>();


        h.put(1, "Hellow");
        h.put(2,"Hello");
        h.put(1,"hhi");

        System.out.println(h);

    }
}
