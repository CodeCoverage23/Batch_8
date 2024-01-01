package com.java.extra;

import java.util.Scanner;

public class SeasonsPrint {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int i = Sc.nextInt();

		switch (i) {

		case 1:
		case 10:
		case 11:
		case 12:
			System.out.println("This is winter season");
			break;

		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("This is summer season");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("This is rainy season");
			break;

		default:
			System.out.println("You entered wrong month");

		}

	}

}
