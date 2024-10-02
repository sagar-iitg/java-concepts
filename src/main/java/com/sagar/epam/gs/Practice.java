package com.sagar.epam.gs;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        int num=1;
        int den=3;
        System.out.println(solve(num,den));

    }

    public static String solve(int num,int den){
        StringBuilder ans=new StringBuilder();

        int q=num/den;
        int rem=num%den;
        ans.append(q);

        if(rem==0) return ans.toString();
        else{
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
                    q=rem/den;
                    rem=rem%den;
                    ans.append(q);
                }

            }

        }
        return ans.toString();
    }
}
