package com.sagar.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {


        List<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(-3);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);


        List<Integer> ls=arr.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(ls);




    }
}
