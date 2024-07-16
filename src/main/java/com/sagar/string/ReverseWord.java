package com.sagar.string;

import java.util.Arrays;

public class ReverseWord {
   public static String reverseWords(String S)
    {
        // code here

        String[] strs=S.split("\\.");
        System.out.println("kkk"+Arrays.toString(strs));
        System.out.println(strs[0]);
        StringBuilder ans=new StringBuilder();

        for(int i=strs.length-1;i>=0;i--){
            ans.append(strs[i]);
            ans.append(".");
        }


        return ans.substring(0, ans.length()-1);
        // return x.substring(0,x.length()-1);
    }

    public static void main(String[] args) {
       String s="i.like.this.program.very.much";

        System.out.println(reverseWords(s));

    }
}
