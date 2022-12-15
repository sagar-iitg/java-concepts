package function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {


    public static void main(String[] args) {

        int[] arr={1,2,34,66,-2};
        change(arr);
        System.out.println(Arrays.toString(arr));



    }





    public static void change(int[] nums)
    {


        nums[0]=10;
        nums=new int[]{1,2,34};

    }
}
