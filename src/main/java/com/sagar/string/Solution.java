package com.sagar.string;

class Solution {
    public static String longestPalindrome(String s) {

        String ans="";

        for(int i=0;i<s.length();i++){

            String even=expand(s,i,i);
            if(even.length()>ans.length()) ans=even;
            String odd=expand(s,i,i+1);
            if(odd.length()>ans.length()) ans=odd;
        

        }
        return ans;

        
    }

    //
    private static String expand(String s,int left,int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

}