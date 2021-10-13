package com.sagar.hashandequals;

public class Main {


    public static void main(String[] args) {


        Human sagar=new Human(123,"Sagar Kumar");

        Human mohit=new Human(124,"Mohit Agarwala");
        Human sk=sagar;


        System.out.println(sagar.hashCode());
        System.out.println(sagar.equals(mohit));
        System.out.println(mohit.hashCode());
        System.out.println(sk.equals(sagar));
        System.out.println(sk.hashCode());
    }
}
