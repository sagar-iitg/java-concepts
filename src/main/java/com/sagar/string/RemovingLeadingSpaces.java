package com.sagar.string;

public class RemovingLeadingSpaces {


    public static void main(String[] args) {
        String str="  abc";
        System.out.println(str);
        int i=0;
        while (str.charAt(i)==' ')
        {
            i++;
        }
        System.out.println(i);
        System.out.println(str.substring(i));
    }
}
