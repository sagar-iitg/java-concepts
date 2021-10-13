package com.sagar.string;

import java.util.Arrays;

public class ReverseWord {
   public static String reverseWords(String S)
    {

        //The \\. is used to escape the dot in the regular expression,
        // otherwise, the dot would be treated as a wildcard that matches any character.

        String[] strs=S.split("\\.");
        System.out.println(Arrays.toString(strs));
        StringBuilder ans=new StringBuilder();

        for(int i=strs.length-1;i>=0;i--){
            ans.append(strs[i]);
            ans.append(".");
        }


        return ans.substring(0, ans.length()-1);
    }

    public static void main(String[] args) {
       String s="i.like.this.program.very.much";

        System.out.println(reverseWords(s));

    }
}
