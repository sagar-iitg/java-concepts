package com.sagar.arrays.example;

import java.util.Arrays;

public class ArrayCopys {
    public static void main(String[] args) {


        int[] arr={10,2,30,40,50};
        int[] subArray= Arrays.copyOfRange(arr,1,arr.length);

        System.out.println(Arrays.toString(subArray));
        int[] nums={1};
        int[] arr1=Arrays.copyOfRange(nums,1,nums.length);
        int[] arr2=Arrays.copyOfRange(nums,0,nums.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
