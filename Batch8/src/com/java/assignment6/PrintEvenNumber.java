package com.java.assignment6;
//write a program  to print all even number from 50 to 75.

public class PrintEvenNumber {

	public static void main(String[] args) {
		int number = 75;
		System.out.print("List of even numbers from 50 to " + number + ": ");
		for (int i = 50; i <= number; i++) {
			// logic to check if the number is even or not
			// if i%2 is equal to zero, the number is even
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
