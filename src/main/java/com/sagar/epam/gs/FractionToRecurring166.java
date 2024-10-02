package com.sagar.epam.gs;


import java.util.HashMap;
import java.util.Map;

public class FractionToRecurring166 {
    public static void main(String[] args) {

        // 1/3,8/4,37/2,428/125,14/3, 47/18, 93/7

        String res=solve(1,3);
        System.out.println(res);
    }
    private static String solve(int num,int den){


        StringBuilder ans=new StringBuilder();
        int q=num/den;
        int rem=num%den;
        ans.append(q);
        if(rem==0) return ans.toString();
        else {
            ans.append(".");
            Map<Integer,Integer> map=new HashMap<>();
            while(rem!=0){
                if(map.containsKey(rem)){
                    int len=map.get(rem);
                    ans.insert(len,"(");
                    ans.append(")");
                    break;

                }else{
                    map.put(rem,ans.length());
                    rem=rem*10;
                    //here numerator is reminder
                    q=rem/den;
                    rem=rem%den;
                    ans.append(q);
                }

            }

        }
        return  ans.toString();




    }
}
