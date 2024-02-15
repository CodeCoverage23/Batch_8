package com.assignment17;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Reverse : ");
		String input = sc.nextLine();

		String reversedString = getReverseString(input);

		System.out.println("The reversed string is : " + reversedString);

	}

	public static String getReverseString(String reverse) {

		StringBuilder sb = new StringBuilder(reverse);

		sb.reverse();

		String reversedString = sb.toString();

		return reversedString;

	}

}
