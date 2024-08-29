package com.sagar.string;

public class StringBuilderExample2 {

    public static void main(String[] args) {

        String s="abbaca";

        StringBuilder ans=new StringBuilder();
        for(int index=0;index<s.length();index++)
        {
            if( (ans.length()-1)>=0 && s.charAt(index)==   ans.charAt(ans.length()-1))
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(s.charAt(index));
            }

        }
        System.out.println(ans);

    }
}
