package com.java.programmingpp;

import java.util.Scanner;

public class MonthSwitchProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a month :");
		int month = sc.nextInt();

		String monthString = "";
		switch (month) {

		case 1:
			monthString = "january";
			break;
		case 2:
			monthString = "february";
			break;
		case 3:
			monthString = "march";
			break;
		case 4:
			monthString = "april";
			break;
		case 5:
			monthString = "may";
			break;
		case 6:
			monthString = "june";
			break;
		default:
			System.out.println("invalid month");

		}

		System.out.println(monthString);

	}
}
