package com.sagar.interview.apexon;

public class FirstNonRepeatingCharacter1{
    public static void main(String[] args) {
        String str="aabdbcc";
        char ch=solve(str);
        System.out.println(ch);
    }
    private static char solve(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j) ){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return ch;
            }
        }
        return '0';
    }

}
