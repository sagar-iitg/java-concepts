package com.sagar.copybytes;

import java.util.Formatter;

public class ASCII {


    public static void main(String[] args) {


        char i='@';
        //char j='a';

      //  System.out.println((int)i);

        Formatter formatter=new Formatter();
        formatter.format("%d",(int) i);
        System.out.println(formatter);
    }
}
