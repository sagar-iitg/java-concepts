package com.sagar.arrays.exmple1;

public class SumOfDigit {

    public static void main(String[] args) {

        int ans=reduceTOSingleDigit(456677);
        System.out.println(ans);
    }

    private static int reduceTOSingleDigit(int number) {

        while(number>9){
            int sum=0;
            while(number>0){
                int rem=number%10;
                sum=sum+rem;
                number=number/10;
            }
            number=sum;
        }
        return  number;
    }
}
