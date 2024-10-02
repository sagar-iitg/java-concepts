package com.sagar.epam.gs;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@ToString
@Getter
class Student{
    String name;
    String grade;

}
public class BestAverageGrade {
    public static void main(String[] args) {

        String[][] input={{"Bob","87"},{"Mike","52"},{"Jason","35"},{"Mike","55"},{"Jessica","99"}};

        // Map to store the sum of grades and count of occurrences for each student
        Map<String, Integer> map = new HashMap<>();
        Map<String,Integer> count=new HashMap<>();

        for(String[] i:input){
            String name=i[0];
            Integer grade=Integer.valueOf(i[1]);
            if(!map.containsKey(name))
                    map.put(name,grade);
            else {
                map.put(name,map.get(name)+grade);
            }

        }
        for(String[] i:input){
            String name=i[0];
            Integer grade=Integer.valueOf(i[1]);
            if(!count.containsKey(name)){
                count.put(name,1);
            }
            else{
                count.put(name,count.get(name)+1);
            }
        }
        System.out.println(map);
        System.out.println(count);
        for(Map.Entry<String,Integer> entry:map.entrySet()){

            String i=entry.getKey();
            int value=count.get(i);
            map.put(i,map.get(i)/value);
        }


        System.out.println(map);
       int max=Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry:map.entrySet()){

           if(max<entry.getValue()){
               max=entry.getValue();
           }
        }
        System.out.println(max);


        // Convert input into a list of Students with parsed grades
        List<Student> students = Arrays.stream(input)
                .map(i -> new Student(i[0], i[1]))
                .collect(Collectors.toList());
        System.out.println(students);

        Map<String, Double> collect = students.stream().collect(Collectors.groupingBy(
                Student::getName,
                Collectors.averagingInt(x -> Integer.valueOf(x.getGrade()))
        ));
        System.out.println(collect);
        double maxAvg = collect.values().stream().max(Comparator.comparing(Double::doubleValue)).orElse(0.0);
        System.out.println(maxAvg);
    }
}
