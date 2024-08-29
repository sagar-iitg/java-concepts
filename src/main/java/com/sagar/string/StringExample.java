package com.sagar.string;

import java.nio.charset.Charset;

public class StringExample {


    public static void main(String[] args) {
        byte[]  b={97,98,};
        String str=new String(b, Charset.defaultCharset());
        System.out.println(str);
        System.out.println(Charset.availableCharsets());
        String s="sagar";
        System.out.println(s.codePointAt(1));
        System.out.println("abc".compareTo("acd"));



    }
}
