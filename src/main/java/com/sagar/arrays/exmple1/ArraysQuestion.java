package com.sagar.arrays.exmple1;

public class ArraysQuestion {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={'4','5'};
        arr1=arr2;
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
