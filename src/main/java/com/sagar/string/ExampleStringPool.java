package com.sagar.string;

public class ExampleStringPool {

    public static void main(String[] args) {
        String str1 = "Verint";
        String str2 = "Verint";
        String str3 = new String("Verint");
        String str4 = str3;
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str3==str4); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str4)); //true
        System.out.println(str2.equals(str4)); //true

    }
}
