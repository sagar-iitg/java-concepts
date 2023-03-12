package com.sagar;

public class PrintFibonacci {
	
	
	static int fibo(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
		
		
	}
	static void fibonacci(int n) {
		
		for(int i=0;i<n;i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println();
		for(int i=0;i<n-1;i++) {
			
			System.out.print(fibo(i));
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		fibonacci(50);

	}

}
