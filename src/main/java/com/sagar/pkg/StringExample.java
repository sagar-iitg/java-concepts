package com.sagar.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringExample {


    public static void main(String[] args) {


        String s="sagar";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        ArrayList<String> arr=new ArrayList<>();

        arr.add("sagar");
        arr.add("mohit");
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);





    }
}
