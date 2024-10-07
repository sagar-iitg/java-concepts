package com.sagar.epam.gs;

public class RunLengthENcoding {

    public static void main(String[] args) {
        String str="aabbbaaa";
        //output a2b3a3
        System.out.println(solve(str));
        String str1="aabbbcccaa";
        //output a2b3a3
        System.out.println(solve(str1));
    }
    private static String solve(String str)
    {

        int n=str.length();
        int c=1;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<n;i++){

            if(str.charAt(i)==str.charAt(i-1)){
                c++;
            }
            else{
                ans.append(str.charAt(i-1)).append(c);
                c=1;
            }
        }
        ans.append(str.charAt(str.length()-1)).append(c);
        return ans.toString();
    }
}
