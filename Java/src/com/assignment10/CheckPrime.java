package com.assignment10;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not...");
		int num = s.nextInt();

		int den = 2;

		while (den < num) {
			if (num % den == 0) {
				break;
			}
			den++;
		}
		if (num == den) {
			System.out.println("It is prime number!");
		} else {
			System.out.println("It is not prime number!");
		}
	}
}
