package com.sagar.generic.example1;

import java.util.ArrayList;
import java.util.List;

public class Example {


    public static void main(String[] args) {
        List l= new ArrayList();
        l.add("India");

       // System.out.println(l.getClass().getName());
        String s = (String) l.get(0);     // typecasting without generics
        System.out.println(s);




    }
}
