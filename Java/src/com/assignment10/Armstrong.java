package com.assignment10;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int arm = 0, c, rem;
		System.out.println("Enter the number:");
		Scanner r = new Scanner(System.in);

		int n = r.nextInt();
		c = n;

		while (n > 0) {
			rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;
		}
		if (c == arm)
			System.out.println("Armstrong Number!");
		else
			System.out.println("Not an  Armstrong Number!");
	}

}
