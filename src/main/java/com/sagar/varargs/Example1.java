package com.sagar.varargs;

import java.util.Arrays;

public class Example1 {


    public static void main(String[] args) {


        fun(1,2,3,4,5,6);
    }

    static void fun(int... s)
    {
        System.out.println(Arrays.toString(s));
    }
}
