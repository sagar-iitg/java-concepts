package com.sagar.epam.gs;

import java.util.HashSet;

public class UniqueTuple {
    public static void main(String[] args) {

        String input="abbccde";
        int len=2;
        HashSet<String>ans= uniqueTuple(input,len);
        System.out.println(ans);

    }
   public static HashSet<String> uniqueTuple(String input, int len){
       HashSet<String> set=new HashSet<>();
       for(int i=0;i<input.length()-len+1;i++){
           String temp=input.substring(i,i+len);
           set.add(temp);
       }
       return set;

   }
}
