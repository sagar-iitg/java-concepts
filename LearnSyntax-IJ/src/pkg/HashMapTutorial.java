package pkg;

import java.util.HashMap;

public class HashMapTutorial {


    public static void main(String[] args) {


        HashMap<Integer,String> h=new HashMap<Integer, String>();

        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");
        h.put(4,"four");
        h.put(5,"five");
        h.put(6,"six");
        h.put(7,"seven");

        System.out.println(h);
        System.out.println(h.size());
        h.keySet().forEach(key-> System.out.println(h.get(key)));








    }
}
