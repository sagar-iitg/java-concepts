package com.sagar.epam.gs;

import java.util.ArrayList;
import java.util.List;

public class StudentElectionProgram {


    public static void main(String[] args) {
        int ans=wholeElected(5,2);
        System.out.println(ans);
    }

    public static int wholeElected(int n,int k){


        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }



        return solve(arr,k,0);


    }
    static int solve(List<Integer> arr,int k,int index){

        if(arr.size()==1){
            return arr.get(0);
        }

        index=(index+k-1)%arr.size();
        arr.remove(index);

        return  solve(arr,k,index);
    }
}
