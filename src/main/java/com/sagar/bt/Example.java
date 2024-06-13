package com.sagar.bt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,2,3,3,3);
        List<Integer> list2=List.of(10,10,3,4,5);

        Map<Integer,Integer> map=new HashMap<>();
        for(Integer ele:list1){


            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{

               map.computeIfPresent(ele,(k,V)->V+1);
            }
        }
        System.out.println(map);

        int c=0;
        for (Map.Entry<Integer,Integer> ele:map.entrySet()){
            if(ele.getValue()>1)  c++;
        }

        System.out.println(c);
//        Map<Integer,Integer> map1=new HashMap<>();
//        for(int i=0;i<list1.size();i++){
//            if(!map.containsKey(list1.get(i))){
//                map1.put(list1.get(i),1);
//            }
//            else{
//                map1.put(list1.get(i),map1.get(i)+1);
//            }
//        }
//
//        int c1=0;
//        for (Map.Entry<Integer,Integer> ele:map1.entrySet()){
//            if(ele.getValue()>1)  c1++;
//        }
//
//        System.out.println(Math.max(c1,c));





    }


}
