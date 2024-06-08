package com.sagar.nonprimitives;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Example2 {


    public static void main(String[] args) {




        BigInteger b1=new BigInteger(new byte[]{0x7d,(byte)0xbc,});
        System.out.println(b1);
        BigDecimal d=new BigDecimal(b1,2);
        System.out.println(d);
    }
}
