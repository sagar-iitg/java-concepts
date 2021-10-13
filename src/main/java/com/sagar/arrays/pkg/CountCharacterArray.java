package com.sagar.arrays.pkg;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacterArray {

    public static void main(String[] args) {

       // Map<Character,Integer> map=new HashMap<>();
        String input="sssagarkumar";
        int[] map=new int[128];
        System.out.println(Arrays.toString(map));

        for(int index=0;index<input.length();index++)
        {
            char ch=input.charAt(index);
            map[ch]++;
        }
        System.out.println(Arrays.toString(map));


    }
}
