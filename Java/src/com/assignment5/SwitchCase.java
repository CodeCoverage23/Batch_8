package com.assignment5;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Month's number:");
		int num = ip.nextInt();

		switch (num) {
		case 1:
			System.out.println("January 2024");
			break;
		case 2:
			System.out.println("February 2024");
			break;
		case 3:
			System.out.println("March 2024");
			break;
		case 4:
			System.out.println("April 2024");
			break;
		case 5:
			System.out.println("May 2024");
			break;
		case 6:
			System.out.println("June 2024");
			break;
		case 7:
			System.out.println("July 2024");
			break;
		case 8:
			System.out.println("August 2024");
			break;
		case 9:
			System.out.println("September 2024");
			break;
		case 10:
			System.out.println("October 2024");
			break;
		case 11:
			System.out.println("November 2024");
			break;
		case 12:
			System.out.println("December 2024");
			break;
		default:
			System.out.println("Enter Valid Month Number...!");
		}
	}

}
