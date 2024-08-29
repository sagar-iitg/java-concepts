package com.sagar.syspkg;

import java.util.Map;

public class Example4 {


    public static void main(String[] args)
    {

        System.out.println(System.getenv());

        System.out.println("----");
        for (Map.Entry<String,String> i:System.getenv().entrySet()) {
            System.out.println(i.getKey()+" "+ i.getValue());
            
        }


    }
}
