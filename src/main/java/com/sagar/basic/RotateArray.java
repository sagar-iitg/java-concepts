package com.sagar.basic;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};


        //{2,4,5,6,7,0,1}
        //{1,2,4,5,6,7,0}
        //{0,1,2,4,5,6,7}  this one is sorted array




        int maxArrayIndex=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
                maxArrayIndex=i;
            }

        }
        System.out.println(maxArrayIndex);


    }
}
