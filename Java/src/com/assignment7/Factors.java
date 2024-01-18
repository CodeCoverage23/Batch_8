package com.assignment7;

import java.util.Scanner;

//Design method to print factors of given number

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factors:");
		int num = sc.nextInt();
		System.out.println("Factors of" + num + " : ");
		printFactors(num);

	}

	public static void printFactors(int num) {
		int den = 1;
		while (num >= den) {
			if (num % den == 0) {
				System.out.println(den);
			}
			den++;
		}
	}

}
