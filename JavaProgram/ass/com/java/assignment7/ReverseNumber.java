package com.java.assignment7;
//Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int reverseNumber = ReverseNumber.getReverseNumber(num);
		System.out.println("The reverse number of " + num + " is :" + reverseNumber);

	}

	public static int getReverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			int lastDigit = num % 10;
			reverse = reverse * 10;
			reverse = reverse + lastDigit;
			num = num / 10;
		}
		return reverse;
	}
}
