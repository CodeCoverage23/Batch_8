package com.task;

import java.util.Scanner;

public class NameInMultipleOf5And7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your sirname : ");
		String sirname = sc.next();

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(name + " " + sirname);
			} else if (i % 5 == 0) {
				System.out.println(name);
			} else if (i % 7 == 0) {
				System.out.println(sirname);
			} else {
				System.out.println(i);
			}
		}

	}

}
