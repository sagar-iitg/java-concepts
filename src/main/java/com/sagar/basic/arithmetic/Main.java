package com.sagar.basic.arithmetic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(-3%7);
        System.out.println(-8%7);
        Map<Integer,Integer> map=new TreeMap<>();
        map.put(1,30);
        map.put(2,30);
        map.put(3,30);
        map.put(4,30);
        System.out.println(map.get(5));
     }
}
