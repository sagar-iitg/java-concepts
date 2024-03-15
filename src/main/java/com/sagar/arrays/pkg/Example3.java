package com.sagar.arrays.pkg;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        //list of list
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"abc",89000));
        list.add(new Student(2,"abc",70010));
        System.out.println(list);


        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++)
                if(list.get(i).getId()==list.get(j).getId()){
                   list.remove(i);
                }

        }



        System.out.println(list);



    }
}
