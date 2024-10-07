package com.sagar.epam.gs;

public class PalindromeInteger {

    public static void main(String[] args) {

        int x=1231;

        int temp=x;
        int reverse=0;
        while(temp!=0){
            reverse=reverse*10+temp%10;
            temp=temp/10;

        }
        System.out.println(reverse);
        if(x==reverse) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
