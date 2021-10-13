package com.sagar.arrays.pkg;

public class Hello {

    public void hello(){
        System.out.println("hello");
    }

    public  void fun(){
        hello();
    }

    public static void main(String[] args) {
       new Hello().fun();
    }
}
