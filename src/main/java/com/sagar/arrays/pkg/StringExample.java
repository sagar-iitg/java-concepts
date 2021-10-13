package com.sagar.arrays.pkg;

import java.util.Arrays;

public class StringExample {


    public static void main(String[] args) {


        String[] s=new String[4];
        System.out.println(s[0]);
        System.out.println(Arrays.toString(s));
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(Arrays.hashCode(s));

    }
}
