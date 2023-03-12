package com.company;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter year! ");
		year=sc.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("The year is leap year");
				}
				else {
					System.out.println("The year is not leap year");
				}
				
				
			}
			else {
				System.out.println("The year is leap year");
			}
			
		}
		else {
			System.out.println("The year is not leap year");
		}

	}

}
