package com.sagar.generic.example1;

public class Example2 {

    public static void main(String[] args) {
        // Fails at runtime!
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in"; // Throws ArrayStoreException
    }
}
