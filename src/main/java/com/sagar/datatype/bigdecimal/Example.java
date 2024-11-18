package com.sagar.datatype.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Example {

    public static void main(String[] args) {

        //storing large integer
        //BigInteger ->Object
        //java.lang.number
        //java.math.BigInteger

        int a=30;
        int b=67;

        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(103939393);
        BigInteger C=new BigInteger("10399393939390");
        BigInteger sum=C.multiply(B);
        System.out.println(sum);

        BigDecimal x=new BigDecimal("0.03");
        BigDecimal y=new BigDecimal("0.04");
        System.out.println(y.subtract(x));

        //problem
        double aa=0.03;
        double bb=0.04;
        System.out.println(bb-aa);




    }
}
