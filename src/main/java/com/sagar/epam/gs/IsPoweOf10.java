package com.sagar.epam.gs;

public class IsPoweOf10 {
    public static void main(String[] args) {
        boolean ans=isPower(1000);
        System.out.println(ans);
    }
    private static boolean isPower(int n){

        while(n%10==0){
            n=n/10;
        }
        if(n==1) return  true;
        return false;
    }
}
