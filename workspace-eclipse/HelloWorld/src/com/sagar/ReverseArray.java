package com.sagar;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {1,2,3,4,5,6,10};
		
		System.out.println();
		System.out.println("Array is: ");
		for(int i:arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end) {
			int temp;
			temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
		System.out.println();
		System.out.println("\nReverse array is:");
		for(int ele:arr) {
			System.out.print(ele);
			System.out.print(" ");
		}
		System.out.println();
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);

	}

}
