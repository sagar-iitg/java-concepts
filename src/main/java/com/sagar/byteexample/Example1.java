package com.sagar.byteexample;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        try{

            String s="ABC";
            // name of supported charset
            // UTF-16 is an encoding constant
            String charsetName = "UTF-16";
            // UTF-16 charset encoding and storing the
            // resultant bytearray.
            byte[] byteArray = s.getBytes("UTF-16");

            // printing the byte array to convert it into
            // string
            System.out.println(Arrays.toString(byteArray));
        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println(e);
        }
    }
}
