package com.sagar.datatype.example1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        // Create a List to store String arrays
        List<String[]> listOfStringArrays = new ArrayList<>();
        listOfStringArrays.add(new String[]{"Apple", "Banana", "Cherry"});
        listOfStringArrays.add(new String[]{"Dog", "Cat", "Mouse"});
        listOfStringArrays.add(new String[]{"Red", "Green", "Blue"});

        System.out.println(listOfStringArrays.get(0).length);

    }
}
