package com.sagar.leetcode;


import java.util.Arrays;

public class LeetCode1664 {

    public static void main(String[] args) {
        int[] nums={2,1,6,4};
        int ans=waysToMakeFair(nums);
        System.out.println(ans);
    }
    public static int waysToMakeFair(int[] nums) {


        int ans=0;

        for(int i=0;i<nums.length;i++){
            int[] x = solve(nums,i);
            int[] copy=evenOdd(x);
            System.out.println(Arrays.toString(copy));
            if(copy[0]==copy[1]){
                ans++;
            }
        }
        return ans;

    }
    static  int[] solve(int[] array,int indexToRemove)
    {
        int[] newArray = new int[array.length - 1];

        if (indexToRemove >= 0 && indexToRemove < array.length)
        {
            // Create a new array with a size one less than the original array

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != indexToRemove) {
                    newArray[j++] = array[i];
                }
            }



        }
        return newArray;

    }

    public static int[] evenOdd(int[] arr){

        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even=even+arr[i];
            }
            else{
                odd=odd+arr[i];
            }
        }
        System.out.println(even+" "+odd);
        return new int[]{even,odd};
    }
}
