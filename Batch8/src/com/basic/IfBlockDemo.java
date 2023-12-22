package com.basic;

public class IfBlockDemo {

	public static void main(String[] args) {

		int a = 11;

		if (a > 10) {
			System.out.println("A is greater");
		}

		System.out.println(a / 2);
		System.out.println(a % 2);

		if (a % 2 == 0) {
			System.out.println("This is Even number");
		} else {
			System.out.println("This is Odd number");
		}

	}

}
