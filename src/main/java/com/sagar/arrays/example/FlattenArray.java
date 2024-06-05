package com.sagar.arrays.example;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {

    static List<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        //[[[1],2],[3,4]] Output -> [1,2,3,4]
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        flatten(array);

        System.out.println(ans);
    }

    private static void flatten(Object[] array) {
        for(Object ele:array){

            if(ele instanceof Integer) ans.add((Integer) ele);
            else if(ele instanceof Object[])  flatten((Object[])ele);
        }

    }


}
