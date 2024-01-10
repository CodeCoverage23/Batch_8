package com.Assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println(" Enter Any Year To Check Whether The year Is Leap or Not: ");
				
	int year = sc.nextInt();
	
	if (year%4==0 && year%100!=0 || year%400==0) {
		
		System.out.println(" : the year is leap year ");
	} else {
		
		System.out.println(" : the year is not a leap year ");
	  }
    }
 }


