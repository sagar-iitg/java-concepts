package com.sagar.byteexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
    
    public static void main(String[] args) throws Exception {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        
        Integer[] flattenedArray = flatten(array);

        
        System.out.println(Arrays.toString(flattenedArray));
    }
    
    public static Integer[] flatten(Object[] array) {
        List<Integer> flatList = new ArrayList<>();
        flattenHelper(array, flatList);
        return flatList.toArray(new Integer[0]);
    }
    
    private static void flattenHelper(Object[] array, List<Integer> flatList) {
        for (Object element : array) {
            if (element instanceof Object[]) {
                flattenHelper((Object[]) element, flatList);
            } else if (element instanceof Integer) {
                flatList.add((Integer) element);
            }
        }
    }
}
