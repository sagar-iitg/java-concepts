package com.sagar.epam.internal.skill.review.example6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(0,1,1,2,3,2,3,4);
        int x=list.indexOf(2);
        int y=list.lastIndexOf(2);
        System.out.println(x);
        System.out.println(y);



    }
}
