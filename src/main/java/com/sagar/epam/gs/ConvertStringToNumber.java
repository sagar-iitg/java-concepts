package com.sagar.epam.gs;

public class ConvertStringToNumber {

    public static void main(String[] args) {

        int number='1'-'0';
        System.out.println(number);

        String str="12345";
        int x=0;
        for(char ch:str.toCharArray()){
            x=x*10+ch-'0';
        }
        System.out.println(x);
        int y=Integer.parseInt(str);
        System.out.println(y);
    }
}
