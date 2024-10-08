package com.sagar.epam.gs;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    public static void main(String[] args) {

        String str="3[a]2[bc]";
        String ans=decodeString(str);
        System.out.println(ans);
    }

    private static String decodeString(String str) {

        Deque<String> st=new ArrayDeque<>();
        for(char ch:str.toCharArray()){
            if(ch==']'){
                StringBuilder stringToRepeat=new StringBuilder();
                while(!st.isEmpty() && !Character.isDigit(st.peek().charAt(0))){

                    String top=st.peek();
                    if(!"[".equals(top))
                        stringToRepeat.append(top);
                    st.pop();
                }
                StringBuilder numericTimes=new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    numericTimes.append(st.peek());
                    st.pop();
                }
                numericTimes.reverse();
                int n=Integer.parseInt(numericTimes.toString());
                String decodeString=stringToRepeat.toString().repeat(n);
                st.push(decodeString);
            }else{
                st.push(Character.toString(ch));
            }
        }



        StringBuilder ans=new StringBuilder();
        while (!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();



    }
}
