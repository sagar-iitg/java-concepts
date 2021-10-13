package com.sagar.pkg;

interface One {
    default void method()    {
        System.out.println("One");
    }
}