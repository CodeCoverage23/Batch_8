package com.assignment7;

//Design method to check whether the character is alphabet, digit and special symbol

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a input to check whether the character is alphabet,digit and special symbol!");
		char charAt = sc.next().charAt(0);
		charType(charAt);
	}

	public static void charType(int ch) {
		if (ch >= 65 && ch <= 90) {
			// checking ascii values for capital letter
			System.out.println("It is a capital letter alphabet!");
		} else if (ch >= 97 && ch <= 122) {
			// checking ascii values for small letter
			System.out.println("It is a small letter alphabet!");
		} else if (ch >= 48 && ch <= 57) {
			// checking ascii values for number
			System.out.println("It is a integer number!");
		} else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)
				|| (ch >= 123 && ch <= 126)) {
			// checking ascii values for special characters
			System.out.println("It is a special character!");
		} else {
			System.out.println("Enter a valid input!!!");
		}
	}
}
