package com.assignment5;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = ip.nextInt();

		if (num % 2 == 0) {
			System.out.println("It is even number.");
		} else {
			System.out.println("It is odd number.");
		}
	}
}
