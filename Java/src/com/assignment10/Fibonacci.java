package com.assignment10;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, c;

		System.out.println("Enter a range to find fibonacci series:");
		Scanner s = new Scanner(System.in);

		int range = s.nextInt();

		for (int i = 1; i <= range; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}
}
