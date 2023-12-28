package com.loops;

import java.util.Scanner;

public class DoWhileLoopDemo2 {

	public static void main(String[] args) {

		int i = 1;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		do {
			j += i;
			System.out.println("Enter the number : ");
			i = sc.nextInt();

		} while (i >= 0);

		System.out.println("Sum : " + j);

	}

}
