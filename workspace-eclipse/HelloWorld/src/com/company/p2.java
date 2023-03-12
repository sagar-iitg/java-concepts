package com.company;

import java.util.Scanner;

public class p2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your marks in physics");
		m1=sc.nextByte();
		System.out.println("Enter Your marks in chemistry");
		m2=sc.nextByte();
		System.out.println("Enter Your marks in Math");
		m3=sc.nextByte();
		
		float avg=(m1+m2+m3)/3.0f;
		
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ) {
			System.out.println("Congratulation  you have been promoted");
			
		}
		else {
			System.out.println("Sorry you have been not promoted");
		}
		
		
		

	}
	

}
