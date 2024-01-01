package com.java.controlstmt;

import java.util.Scanner;

public class DoWhileLoopScanner {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;

		Scanner Sc = new Scanner(System.in);

		do {
			j += i;
			System.out.println("Enter the number : ");
			i = Sc.nextInt();
		} while (i >= 0);

		System.out.println("Sum :" + j);
	}

}
//Program will break after giving negative value.