package com.java.programmingpp;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 6;
		int count = 0;

		if (num > 0) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {

				System.out.println("the given number is prime number");
			} else {
				System.out.println("the given number is not prime number");
			}

		}

		else {

			System.out.println("invalid number");
		}

	}
}
