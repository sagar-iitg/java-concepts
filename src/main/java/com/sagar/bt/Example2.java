package com.sagar.bt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 2, 3, 3, 3);
        System.out.println(list1.get(0));

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<list1.size();i++){
            if(!map.containsKey(list1.get(i))){
                map.put(list1.get(i),1);
            }else{
                map.put(list1.get(i),map.get(list1.get(i))+1);
            }

        }
        System.out.println(map);
    }
}
