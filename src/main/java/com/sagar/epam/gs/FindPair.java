package com.sagar.epam.gs;

import java.util.HashMap;
import java.util.Map;

public class FindPair {

    public static void main(String[] args) {

        int[] arr={1,1,1,1};
        int k=2;
        int ans= solve(arr,k);
        System.out.println(ans);
    }
    private static int solve(int[] arr,int k){

        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){

            int comp=k-arr[i];
            if(map.containsKey(comp)){

               ans=ans+map.get(comp);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return  ans;

    }
}
