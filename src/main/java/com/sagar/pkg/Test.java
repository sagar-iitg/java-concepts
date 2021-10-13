package com.sagar.pkg;

public class Test {



    static int a=2;

    static void fun()
    {
        a=5;

    }

    static void fun1()
    {
        fun();
        System.out.println(a);

    }

    public static void main(String[] args) {


        fun1();

    }




}
