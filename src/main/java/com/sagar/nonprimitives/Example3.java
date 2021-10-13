package com.sagar.nonprimitives;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Example3 {
    public static void main(String[] args) {


        BigDecimal d=new BigDecimal(new BigInteger("123456"),3);
        System.out.println(d);
    }

}
