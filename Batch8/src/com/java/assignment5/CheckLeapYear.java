package com.java.assignment5;

import java.util.Scanner;

//2.write a program to check whether year is leap year or not. (If else stmt).
public class CheckLeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a year to check leap year or not : ");

		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("the given year is leap year ");
		} else {
			System.out.println("the given year is not leap year");
		}

	}

}
