package com.assignment5;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("Number Is Positive");
		} else {
			System.out.println("Number Is Negative");
		}
	}
}
