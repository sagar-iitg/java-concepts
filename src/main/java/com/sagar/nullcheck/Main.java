package com.sagar.nullcheck;

public class Main {

    public static void main(String[] args) {

        String s=null;
        String s1=null;

       //fun( null,null);
       fun(s,s1);

    }

    private static void fun(String s, String s1) {

        System.out.println("hello string");
    }
    private static void fun(StringBuilder s, StringBuilder s1) {

        System.out.println("hello stringBuilder");
    }

}
