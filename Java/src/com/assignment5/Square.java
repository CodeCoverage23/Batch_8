package com.assignment5;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = ip.nextInt();

		int square = num * num;
		System.out.println("The square of " + num + " is " + square);
	}

}
