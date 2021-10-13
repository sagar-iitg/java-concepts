package com.sagar.basic;

import java.util.Arrays;

public class CountZerosandOnes {

    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,0,0,0};
        // {}

        int countZero=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0) countZero++;
      }
      int countOnes=arr.length-countZero;
      int j=0;
    while (j<countZero){
        arr[j]=0;
        j++;
    }

    for(int k=j;k<arr.length;k++) arr[k]=1;

        System.out.println(Arrays.toString(arr));

        long countZ = Arrays.stream(arr).filter(i -> i == 0).count();
        long countOne = Arrays.stream(arr).filter(i -> i == 1).count();


        System.out.println(countZ);


    }
}
