package com.sagar.varargs;

public class SumOfNos {

    public static void main(String[] args) {

        sum(2,3,4,5);
        sum(2,3);
        sum(3,3);
        sum();
    }

   private static void sum(int... s){
        int sum=0;

        int n=s.length;
       for (int ele : s) {
           sum = sum + ele;
       }
       System.out.println(sum);
    }
}
