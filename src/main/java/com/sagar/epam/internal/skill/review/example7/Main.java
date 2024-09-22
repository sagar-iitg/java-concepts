package com.sagar.epam.internal.skill.review.example7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str="i love my india";

        String res = Arrays.stream(str.split(" ")).collect(Collectors.collectingAndThen(

                Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return list.stream().collect(Collectors.joining(" "));
                }
        ));
        System.out.println(res);
        String result = Arrays.stream(str.split("\\s+"))
                .reduce((a, b) -> b + " " + a)
                .orElse("");



        System.out.println(result);





    }
}
