package com.sagar.intchar;

public class ASCIICharacter {
    public static void main(String[] args) {

        int[] arr=new int[95];

        for(int i=0;i<arr.length;i++){
            System.out.println((char)(i+32) +" "+ (i+32));
        }


    }
}
