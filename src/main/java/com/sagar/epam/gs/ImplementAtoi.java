package com.sagar.epam.gs;

public class ImplementAtoi {
    public static void main(String[] args) {
        char[] ch={'1','2','3'};
        int ans=atoi(ch);
        System.out.println(ans);
    }

    public static int atoi(char s[]) {
        // code here
        int i=0;
        int n=s.length;
        int sign=1;
        while(i<n && s[i]==' ')
        {
            i++;
        }
        if(i<n && s[i]=='-'){
            sign=-1;
            i++;
        }

        int ans=0;

        while(i<n && Character.isDigit(s[i])){
            ans=ans*10+s[i]-'0';
            i++;
        }
        if(sign==-1) ans=ans*-1;
        return ans;
    }
}
