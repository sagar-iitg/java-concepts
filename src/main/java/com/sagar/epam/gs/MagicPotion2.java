package com.sagar.epam.gs;

public class MagicPotion2 {
    public static void main(String[] args) {


        if (minimalSteps("ABABCABABCE") == 6
                && minimalSteps("ABCDABCE") == 8
                && minimalSteps("ABCABCE") == 5
                && minimalSteps("AAA") == 3
                && minimalSteps("AAAA") == 3
                && minimalSteps("BBB") == 3
                && minimalSteps("AAAAAA") == 4 && minimalSteps("ABCABCE")==5) {
            System.out.println();
            System.out.println("Pass");
        } else {
            System.out.println();
            System.out.println("Fail");
        }
    }

    public static int solve(String s, int i) {


        if(i<0) return 0;

        int ans=i+1;

        if((i+1)%2==0){

            String sub1=s.substring(0,(i+1)/2);
            String sub2=s.substring((i+1)/2,i+1);
            if(sub1.equals(sub2)){
                ans=1+solve(s,(i+1)/2-1);
            }
        }
        ans=Math.min(ans,1+solve(s,i-1));
        return  ans;
    }

    public static int minimalSteps(String s) {
        return solve(s, s.length() - 1);  // Start solving from the full string
    }

}
