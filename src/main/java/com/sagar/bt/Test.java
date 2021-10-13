package com.sagar.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
         numbers.add(1);
         numbers.add(new Integer(3));
         numbers.add(new Integer(5));
         numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);

        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);




    }
}
