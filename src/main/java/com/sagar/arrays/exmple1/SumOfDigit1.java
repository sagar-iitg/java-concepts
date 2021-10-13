package com.sagar.arrays.exmple1;

public class SumOfDigit1 {

    public static void main(String[] args) {

        int ans=reduceTOSingleDigit(0);
        System.out.println(ans);
    }

    private static int reduceTOSingleDigit(int number) {


        int ans=sumOfDigit(number);
        if(ans<=9) return ans;
        return  reduceTOSingleDigit(ans);
    }
    private  static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n/=10;
        }
        return  sum;
    }
}
