package com.sagar.integer.example;

import static java.lang.Integer.parseInt;

public class Example1 {

    public static void main(String[] args) {


        //returns primitive int

        int x= parseInt("0",10);
        System.out.println(x);
        System.out.println(parseInt("+42",10));
        System.out.println(parseInt("-0",10));
        System.out.println(parseInt("+0",10));

        int y=Integer.parseInt("-FF",16);
        System.out.println(parseInt("-FF",16));
        System.out.println( parseInt("Kona", 27) );
        //System.out.println( parseInt("99", 8));
        System.out.println(parseInt("-2147483648", 10));
        System.out.println(parseInt("2147483647", 10));
        //System.out.println(parseInt("2147483648", 10));


    }
}
