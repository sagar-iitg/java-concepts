package com.sagar.system.pkg;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        //System.arraycopy(a, 0, b, 4, 2);
        try{
            System.arraycopy(a, 0, b, 4, 2);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        // array b after arraycopy operation
        System.out.println(Arrays.toString(b));
        System.out.println(System.currentTimeMillis());
    }
}
