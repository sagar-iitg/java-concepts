package com.sagar.epam.gs;


import java.util.ArrayDeque;
import java.util.Deque;

class StringReducer{

    private static class Pair{

        char ch;
        int count;

        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static String reduceString(String str, int k){

        Deque<Pair> st=new ArrayDeque<>();

        for(char ch:str.toCharArray()){

            if(!st.isEmpty() && st.peek().ch==ch){
                st.peek().count++;

                if(st.peek().count==k){
                    st.pop();
                }
            }else{
                st.push(new Pair(ch,1));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(Pair p:st){
            ans.append(String.valueOf(p.ch).repeat(p.count));
        }
        return  ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        int k=2;
        System.out.println(reduceString(s,k));

    }
}

