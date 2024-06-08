package com.sagar.mypackage;

public class Palindrome {


    public static void main(String[] args) {

        String str="madam";
        String reverse="";


        for(int i=str.length()-1;i>=0;i--)
            reverse=reverse+str.charAt(i);

        System.out.println(reverse);
        if(str.equals(reverse))  System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}


