package com.sagar.pkg;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        Random myRandom=new Random();

        System.out.println(myRandom.nextInt(10));
        System.out.println(myRandom.nextInt());
    }
}
