package com.Assign5;

import java.util.Scanner;

//2.write a program to check whether year is leap year or not. (If else stmt).
public class Que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check if it is a leap year or not : ");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
