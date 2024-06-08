package com.sagar.copybytes;

public class Example3 {


    public static void main(String[] args) {
        String[] binArray = {"10101","11100","11010","00101"};
        System.out.println(binArray.length);
        byte[]bytes = new byte[binArray.length];

        for (int i=0; i< binArray.length;i++)
        {
            bytes[i] = Byte.parseByte(binArray[i], 2);
            System.out.println(bytes[i]);
        }


    }
}
