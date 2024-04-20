package com.sagar.arrays.pkg;

import java.util.Arrays;

public class MergeTwoSortedArray {


    public static  void main(String[] args){
        int arr1[]={1,2,3};
        int arr2[]={2,5,6};
        mergeArray(arr1,arr2);
    }

    // 1,2,3,4,5,10,20,30,40,50
    private static void mergeArray(int[] arr1,int[] arr2){
        int l1=arr1.length;
        int l2=arr2.length;
        int mergeSortedArray[]=new int[l1+l2];
        int i=0;
        int j=0;
        int k=0;

        while(i<l1 && j<l2){

            if(arr1[i]<arr2[j]){
                mergeSortedArray[k]=arr1[i];
                i++;
                k++;
            }
            else{
                mergeSortedArray[k]=arr2[j];
                j++;
                k++;

            }
        }

        while(i<l1){
            mergeSortedArray[k]=arr1[i];
            i++;
            k++;
        }
        while(j<l2){
            mergeSortedArray[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergeSortedArray));



    }
}
