package com.sagar.interview.apexon;

public class FirstNonRepeatingCharacter{
    public static void main(String[] args) {
        String str="aabbcc";
        char ch=solve(str);
        System.out.println(ch);

    }
    private static char solve(String s){

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                return s.charAt(i);
            }
        }
        return '0';
    }

}
