package com.sagar.arrays;

import java.util.*;

public class Example {

    public static void main(String[] args) {


        List<Integer> listOfValues = Arrays.asList(2, 3, 4, 5, 6, 7, 8);


        OptionalInt max = listOfValues.stream().mapToInt(x -> x).max();
        OptionalInt min = listOfValues.stream().mapToInt(x -> x).min();

        System.out.println(max);
        System.out.println(min);

        List<Integer> listOfValues1= Arrays.asList(1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9);
        int[] arr={1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9};
        //1 - 1
        //2 -1
        //3 -1
        //4 -2
        //5-1
        //6-2
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<listOfValues1.size();i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);




    }
}
