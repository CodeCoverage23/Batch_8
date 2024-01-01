package com.java.controlstmt;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int i = Sc.nextInt();

		switch (i) {

		case 1:
			System.out.println("The number is one");
			break;

		case 2:
			System.out.println("The number is two");
			break;

		case 3:
			System.out.println("The number is three");
			break;

		default:
			System.out.println("The number is not in range");

		}

	}

}
