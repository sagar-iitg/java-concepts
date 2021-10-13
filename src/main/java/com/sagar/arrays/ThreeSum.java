package com.sagar.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>>  ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){

            // if(i>0 && arr[i-1]==arr[i]){
            //     continue;
            // }
            int j=i+1;
            int k=arr.length-1;

            while(j<k){

                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ans.add(List.of(arr[i],arr[j],arr[k]));
                    j++;
                    k--;

                    // while(j<k && arr[j]==arr[j-1])
                    //     j++;



                    // while(j<k && arr[k]==arr[k+1])
                    //     k--;

                }
                else if(sum>0){
                    k--;

                }
                else{
                    j++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
}
