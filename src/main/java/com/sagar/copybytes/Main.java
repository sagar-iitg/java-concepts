package com.sagar.copybytes;

public class Main {

    public static void main(String[] args) {


        String inputString = "Hello World!";
        byte[] byteArrray = inputString.getBytes();



        //System.out.println(byteArrray[0]);
        for (int i:byteArrray)
        {
            System.out.println(i);

        }

        char ch=72;
        System.out.println(ch);
        System.out.println();

        char ch1='H';
        System.out.println("last"+(int)ch1);
    }
}
