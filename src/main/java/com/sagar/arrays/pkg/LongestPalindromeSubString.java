package com.sagar.arrays.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindromeSubString {

    public static void main(String[] args) {

        String s="abc";
        //a
        //ab
        //abc

        solve(s);
    }
    public  static  void solve(String str) {


        List<String> subString=new ArrayList<>();
        //Step 1= find all substring
        // step2:  which one is palindrome
        // step3: find largest string
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                subString.add(str.substring(i,j+1));
            }
        }
        System.out.println(subString);

        int max=-1;
        String ans="";
        //["abaaba","aba","abaa",]
        for (String substr:subString) {
            boolean flag=palindrome(substr);
            if(flag){
                //max=Math.max(max,substr.length());
                if(max<substr.length()){
                    max=substr.length();
                    ans=substr;
                }

            }
        }
        System.out.println(ans);
    }

    public static boolean palindrome(String str){

        int start=0;
        int end=str.length()-1;

        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return  false;
            }
            else{
                start++;
                end--;
            }
        }
        return  true;


    }


}

