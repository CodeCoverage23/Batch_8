package com.java.assignment5;

import java.util.Scanner;

//Write a java program to check whether year is leap year or not.(if else stmt).
public class LeapYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a year to check whether leap year or not : ");
		
		int num = sc.nextInt();
		
		if(num%4==0 && num%100!=0 || num%400==0) {
			
			System.out.println("the given year is a leap year");
			 
		}
		else {
			System.out.println("the given number is not leap year");
			
		}
		
	}

}
