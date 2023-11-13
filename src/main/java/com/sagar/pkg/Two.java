package com.sagar.pkg;

interface Two {
    default void method () {
        System.out.println("two");
    }
}