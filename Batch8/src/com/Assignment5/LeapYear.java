package com.Assignment5;

import java.util.Scanner;
//2.write a program to check whether year is leap year or not. (If else stmt).



public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner (System.in);
		
		System.out.println("Enter a year to chek to weather the year is leap or not: ");
		
		int num = SC.nextInt ();
		
		if(num%4==0 && num%100!=0 || num%400==0) {
			
			System.out.println("the given year is a leap year");
			
		}
		
		else {
			System.out.println("the given year is not leap year");
			
		}
		
		
	}

}