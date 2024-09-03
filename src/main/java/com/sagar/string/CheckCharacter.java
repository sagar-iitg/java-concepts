package com.sagar.string;

public class CheckCharacter {

    public static void main(String[] args) {
        String str="abcdefg";
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i)-'a';
            System.out.println(val);
        }
    }
}
