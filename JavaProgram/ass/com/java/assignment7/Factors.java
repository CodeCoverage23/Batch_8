package com.java.assignment7;
//Design method to print factors of a given number (enter no = 6 then factors should be displayed like 1,2,3,6)
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mumber :");
		int num = sc.nextInt();
		System.out.println("The factor of " + num + " is :");
		Factors.getNumber(num);
	}

	public static void getNumber(int num) {
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}