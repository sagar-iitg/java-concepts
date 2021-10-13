package com.sagar.interview1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {

    public static void main(String[] args) {

        String str="sagar";

        //aagrs
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){

            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        System.out.println(map);

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println(i+" "+str.charAt(i));
                break;
            }
        }

    }
}
