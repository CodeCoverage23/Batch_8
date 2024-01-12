package com.java.assignment5;
//Write a program to check the number is positive or negative.
import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check positive or negative : ");

		int a = sc.nextInt();

		if (a >= 0) {
			System.out.println("The given number is positive");
		} else {
			System.out.println("The given number is negative");
		}

	}

}
