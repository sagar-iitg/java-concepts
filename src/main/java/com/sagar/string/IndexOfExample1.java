package com.sagar.string;

public class IndexOfExample1 {

    public static void main(String[] args) {

        String str ="abcab";
        System.out.println(solve(str));




    }

    public static int solve(String str){
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)) return i;

        }
        return -1;
    }
}
