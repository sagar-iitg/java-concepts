package com.sagar.string;

public class StringExamaple3 {
    public static void main(String[] args) {
        String s=" ";
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
       System.out.println(s.charAt(0));
    }
}
