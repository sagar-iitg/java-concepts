package com.sagar.env;

public class Example {
    public static void main(String[] args) {

        int countLogicalProcess=Runtime.getRuntime().availableProcessors();
        System.out.println(countLogicalProcess);
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime().totalMemory());


    }
}
