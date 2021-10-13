package com.sagar.arrays.pkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FreqCount {


    public static void main(String[] args) {
        String str="abcd abcde oue";
        Set<Character> set=new HashSet<>();

        for (char ch:str.toCharArray()) {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') set.add(ch);

        }
        System.out.println(set.size());






    }
}
