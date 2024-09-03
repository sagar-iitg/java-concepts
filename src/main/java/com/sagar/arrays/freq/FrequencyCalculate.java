package com.sagar.arrays.freq;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCalculate {

    public static void main(String[] args) {

        String str="asa";
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
