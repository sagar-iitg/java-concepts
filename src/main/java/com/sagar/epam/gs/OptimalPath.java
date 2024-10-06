package com.sagar.epam.gs;

public class OptimalPath {
    public static void main(String[] args) {

        int[][] arr={
                {0,0,0,0,5},
                {0,1,1,1,0 },
                {2,0,0,0,0}
        };

        int row=arr.length;
        int col=arr[0].length;
        int ans=solve(arr,row-1,0);
        System.out.println(ans);

    }

    private static  int solve(int[][] arr,int i,int j){

        //corner case
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length) return Integer.MIN_VALUE;

        //base case

        if(i==0 && j==arr[0].length-1){
            return arr[i][j];
        }

        int up=arr[i][j]+solve(arr,i-1,j);
        int right=arr[i][j]+solve(arr,i,j+1);
        return Math.max(up,right);
    }
}
