package com.basic;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i = sc.nextInt();

		switch (i) {

		case 1:
			System.out.println("The number is one");
			break;
		case 2:
			System.out.println("The number is Two");
			break;
		case 3:
			System.out.println("The number is Three");
			break;
		case 4:
			System.out.println("The number is Four");
			break;
		case 5:
			System.out.println("The number is Five");
			break;
		default:
			System.out.println("The number is not in range");

		}

	}
}
