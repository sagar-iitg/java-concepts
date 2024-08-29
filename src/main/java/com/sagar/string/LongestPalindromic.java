package com.sagar.string;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromic {

    public static void main(String[] args) {

        String str= "babad";
        List<String> list=new ArrayList<>();
        int max=0;
        String temp="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
               // list.add(str.substring(i,j+1));
                String ele=str.substring(i,j+1);
                boolean flag=isPalindrome(ele);
                if(flag){
                    if(max<ele.length()){
                        max=ele.length();
                        temp=ele;

                    }

            }
        }


    }
        System.out.println(temp);


}

    private static boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}
