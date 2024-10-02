package com.sagar.epam.gs;

public class MinimumInSorted {

    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2};
        int ans=solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr){
        int start=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (start<=end){
            int mid=start+(end-start)/2;

            //left half is sorted
            if(arr[mid]>=arr[start]){
                ans=Math.min(ans,arr[start]);
                start=mid+1;
            }
            //right half is sorted
            else {

                ans=Math.min(ans,arr[mid]);
                end=mid-1;

            }
        }
        return  ans;
    }

}
