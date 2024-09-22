package com.sagar.epam.internal.skill.review.example4;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
