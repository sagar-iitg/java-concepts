package com.sagar.arrays.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) {

        //{"project1":{"develoer: ","qa: "},"project2":{"a:","b"}}

       //

        Map<String ,String > map=new HashMap<>();
        map.put("S3Location"," s3://iics-build-abc/");
        map.put("commitId","d393a4727");

        List<Map<String,String>> list=new ArrayList<>();
        list.add(map);

        Map<String, List< Map<String ,String >>> res=new HashMap<>();
        res.put("abc",list);
        System.out.println(res);

        for(int i=0;i<res.size();i++){
            Map<String, List< Map<String ,String >>> res1=new HashMap<>();

            if(!map.containsKey(res.get(i))){
                /// list of dictionay

                //res1.put(res1.get(i),list);
            }

        }
















    }
}
