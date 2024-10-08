package com.sagar.epam.gs;

import java.util.Arrays;

public class LongestUniformSubString {
    public static void main(String[] args) {

        String str="aabbbcc";


        int[] ans={-1,-1};
        solve(str,ans);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(String str, int[] ans) {

        int startIndex=0;
        int endIndex=0;
        int maxLen=0;
        for(int i=1;i<str.length();i++){

            if(str.charAt(i-1)==str.charAt(i)){
                endIndex++;
            }
            else{
                if(endIndex-startIndex+1>maxLen){
                    ans[0]=startIndex;
                    ans[1]=endIndex;
                    maxLen=endIndex-startIndex+1;
                }
                startIndex=i;
                endIndex=i;

            }
        }
        if(endIndex-startIndex+1>maxLen){
            ans[0]=startIndex;
            ans[1]=endIndex;
            maxLen=endIndex-startIndex+1;
        }
        return  ans;

    }
}
