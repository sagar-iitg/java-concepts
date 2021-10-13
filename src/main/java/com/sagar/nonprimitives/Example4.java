package com.sagar.nonprimitives;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Example4 {


    public static void main(String[] args)
    {


        System.out.println(BigDecimal.ZERO);
        System.out.println(BigInteger.valueOf(Integer.MAX_VALUE));
        System.out.println(BigDecimal.valueOf(Double.MAX_VALUE));
        System.out.println(new BigDecimal(Double.MAX_VALUE).toBigInteger());
        System.out.println(new BigDecimal(Double.MAX_VALUE).toBigInteger().negate());
        byte[] HEX_FILLER={0x00,0x20};
        System.out.println(HEX_FILLER[0]+" "+HEX_FILLER[1]);


    }


}
