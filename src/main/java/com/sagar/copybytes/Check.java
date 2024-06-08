package com.sagar.copybytes;

import java.io.UnsupportedEncodingException;

public class Check {


    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] byteArrray = { 65,66,67,32,97,98,99,32,72, 101, 108, 108, 111, 32, 87, 111, 114,
                108, 100, 33 };

        String string = new String(byteArrray);

        System.out.println(string);

    }




}
