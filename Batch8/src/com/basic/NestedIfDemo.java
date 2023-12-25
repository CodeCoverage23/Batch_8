package com.basic;

public class NestedIfDemo {

	public static void main(String[] args) {

		int age = 16;
		int weight = 55;

		if (age > 18) {
			System.out.println("Age is greater than 18");
			if (weight < 50) {
				System.out.println("You can donate the Blood");
			}

		}

	}

}
