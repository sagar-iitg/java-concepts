package basic;

import java.util.Arrays;

public class Example3 {


    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,1,2,4};

        long res=findNumbers(nums);
        System.out.println(res);


    }

    private static long findNumbers(int[] nums) {
      return Arrays.stream(nums).count();


      //Arrays.stream(nums).mapToObj()
    }
}
