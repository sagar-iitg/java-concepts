package com.sagar;

public class Factorial {
	
	
	
	 int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	 int factIterative(int n) {
		 int ans=1;
		 for(int i=1;i<=n;i++) {
			 ans=ans*i;
		 }
		 return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial ob=new Factorial();
		
		System.out.println(ob.fact(6));
		System.out.println(ob.factIterative(6));

	}

}
