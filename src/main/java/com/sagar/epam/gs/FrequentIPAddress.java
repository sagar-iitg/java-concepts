package com.sagar.epam.gs;

import java.util.HashMap;
import java.util.Map;

public class FrequentIPAddress {

    public static void main(String[] args) {

        String[] ip={"10.0.0.1 -GET 2020-08-24","10.0.0.1 -GET 2021-08-24","10.0.0.2 -GET 2021-08-24"};

        Map<String,Integer> map=new HashMap<>();
        for(String i:ip){
            String[] ipAddress=i.split("-");
            System.out.println(ipAddress[0]);
            map.put(ipAddress[0],map.getOrDefault(ipAddress[0],0)+1);
        }
        System.out.println(map);
        int x=-1;
        String ans="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){

            if(entry.getValue()>x){
                x=entry.getValue();
                ans=entry.getKey();

            }
        }
        System.out.println(ans);


    }
}
