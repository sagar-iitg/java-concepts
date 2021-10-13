package com.sagar.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

@FunctionalInterface
interface A{

    void method();
}

public class LambdaExample {


    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.stream().forEach(System.out::println);
        //Consumer

        A obj=()-> System.out.println("hello method");
        obj.method();



    }
}
