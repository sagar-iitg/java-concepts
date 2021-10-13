package com.sagar.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class uestion {


    public static void main(String[] args) {



        int arr[]=new int[]{ 1,2,-1,-1,-1,3,-1,100};
        int minIndex=0;
        int min_no=arr[0];
        ArrayList<Integer> list=new ArrayList<>();


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[minIndex])
            {
                list.add(i);
            }

            else if(arr[minIndex] > arr[i])
            {
                list.clear();
                list.add(i);
                min_no=arr[i];
                minIndex=i;
            }

        }
        System.out.println(list);
        System.out.println(min_no);
    }
}
