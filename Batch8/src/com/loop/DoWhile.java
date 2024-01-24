package com.loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int i = 0, j = 0;
		Scanner sc = new Scanner(System.in);
		do {

			j += i;
			System.out.println("j=" + j);
			System.out.println("enter value of i : ");
			i = sc.nextInt();
		} while (i >= 0);

		sc.close();
	}

}
