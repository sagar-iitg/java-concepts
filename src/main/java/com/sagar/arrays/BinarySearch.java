package com.sagar.arrays;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,10,15,100};
        //start=0;
        //end=5
        //mid=2
        int target=15;

        int index=search(arr,arr.length-1,target);
        System.out.println(index);
    }
    static  int search(int[] arr,int n,int target){

        int start=0;
        int end=n;

        while(start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==target) return mid;

            else if(arr[mid]>target){
                end--;
            }
            else{
                start++;
            }

        }
        return -1;


    }



}



