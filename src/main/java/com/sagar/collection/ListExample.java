package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        Vector<Integer> vector=new Vector<>();
        Stack<Integer> st=new Stack<>();



        //create

        arrayList.add(1);
        linkedList.add(10);
        vector.add(100);
        st.add(1000);
        arrayList.add(11);
        linkedList.add(101);
        vector.add(1001);
        st.add(10001);  //using vector class add method

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(vector);
        System.out.println(st);

        //Read

        System.out.println(arrayList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(vector.get(1));
        System.out.println(st.get(0));    //using vector class get method





        //Update


        System.out.println("-------------update--------------");

        //return old value
        System.out.println(arrayList.set(0,33));
        System.out.println(arrayList.get(0));
        System.out.println(linkedList.set(1,55));
        System.out.println(linkedList.get(1));

        System.out.println(vector.set(0,99));
        System.out.println(vector.get(0));

        System.out.println(st.set(0,999));
        System.out.println(st.get(0));



        //delete

        System.out.println("--------------------delete----------------");

        System.out.println(arrayList.remove(0));
        System.out.println(linkedList.remove(0));
        System.out.println(vector.remove(0));
        System.out.println(st.remove(1));






    }
}
