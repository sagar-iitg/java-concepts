package com.company;

import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("Please Enter Your age!");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		switch(age) {
		case 18:
			System.out.println("Now u r adult");
			break;
		case 21:
			System.out.println("job");
			break;
		
		case 60:
			System.out.println("Retired");
			break;
			
		default:
			System.out.println("Enjoy life");
		
		

	}
		}
	

}
