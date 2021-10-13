package com.sagar;

public class MethodFunction1 {


	int sum(int x,int y) {
		return x+y;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creating object of a MethodFunction1 Class
		MethodFunction1 obj=new MethodFunction1();
		int ans=obj.sum(16,6);
		System.out.println(ans);
		System.out.println(obj.sum(10,10));
		System.out.println(obj.sum(-10,10));
		
		
	
	}

}
