package com.sagar.syspkg;

import java.util.Arrays;

public class Example2 {


    public static void main(String[] args) {

        int src[] = { 0, 1, 2, 3, 4, 5 ,6};
        int des[] = { 5, 10, 20, 30, 40, 50 };

        System.arraycopy(src,3,des,0,4);
        System.out.println(Arrays.toString(des));
    }
}
