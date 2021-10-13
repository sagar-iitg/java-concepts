package com.sagar.interview3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        //[[[1],2],[3,4]] Output -> [1,2,3,4]
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        Integer[] result=flatten(array);
        System.out.println(Arrays.toString(result));
    }
    public static Integer[] flatten(Object[] array){

        List<Integer> ans =new ArrayList<>();
        flattenHelper(array,ans);
        Integer[] res=new Integer[ans.size()];
        for(int i=0;i<res.length;i++) res[i]=ans.get(i);
        return res;

    }
    public static void flattenHelper(Object[] array, List<Integer> ans){

        for (Object ele:array) {
            if(ele instanceof Integer){
                ans.add((Integer) ele);
            }
            else if(ele instanceof Object[]){
                flattenHelper((Object[]) ele,ans);
            }
        }

    }

}
