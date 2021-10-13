package com.sagar.generic.example2;

public class GenericsExample {


    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }

    public static void main(String[] args) {

        Long[] arr={10L,9L,8L,9L};
        int ans=count(arr,9L);
        System.out.println(ans);

        Integer[] arr1={10,9,8,9};
        int ans1=count(arr1,9);
        System.out.println(ans1);



    }
}
