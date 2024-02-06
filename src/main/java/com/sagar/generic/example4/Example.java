package com.sagar.generic.example4;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        unsafe(strings, Integer.valueOf(2));
        String s=strings.get(0);

    }
    private static void unsafe(List list,Object o){
        list.add(o);
    }
}
