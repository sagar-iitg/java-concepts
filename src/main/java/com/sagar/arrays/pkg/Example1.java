package com.sagar.arrays.pkg;

import java.util.Arrays;

public class Example1 {


    public static void main(String[] args)
    {

        int arr[]=new int[]{10,-2,0,78,-7,34,-1,9,99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        char[] chars={'s','a','g','a','r'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        String[] strings={"sagar","abd","abe","aba","hjj"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


    }
}
