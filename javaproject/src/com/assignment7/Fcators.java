package com.assignment7;

import java.util.Scanner;

// Design a method to print factor of a given number

public class Fcators {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a number to find its factors : ");
		int num = sc.nextInt();
		System.out.println(" Factors of " + num + " : ");
		printFactors(num);
	}

	public static void printFactors(int num) {
	int Fact = 1;
	while( num>=Fact) {
		if (num % Fact== 0) {
			System.out.println(Fact);
		}
		Fact ++;
	}
		
	}

}
