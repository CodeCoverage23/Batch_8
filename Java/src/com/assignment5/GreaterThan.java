package com.assignment5;

import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = ip.nextInt();

		if (num > 100) {
			System.out.println("Number is greater than 100");
		} else {
			System.out.println("Number is not greater than 100");
		}
	}

}
