package com.java.extra;

//Write a program to print your name in multiple of 5 & your surname in the multiple of 7 & your fullname in the multiple of 5*7.

import java.util.Scanner;

public class NameMultipleIfElseLadder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value to print name multiple :");
		int number = sc.nextInt();
		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0 && i % 7 == 0) {
				
				System.out.println(i + " : Yogeshwari Patil");

			} else
				if (i % 5 == 0) {
				
					System.out.println(i + " : Yogeshwari");
			} else 
				if (i % 7 == 0) {
				
					System.out.println(i + " : Patil");
			} else {
				
				System.out.println(i);
			}
		}

	}

}
