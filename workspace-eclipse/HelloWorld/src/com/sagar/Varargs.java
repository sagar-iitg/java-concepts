package com.sagar;

public class Varargs {
	
	
	static int sum(int ...arr) {
//		Available as int [] arr;
		int ans=0;
		for(int i:arr ) {
			ans+=i;
		}
		return ans;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4,-2));
		
	
	}

}
