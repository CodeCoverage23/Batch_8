package com.java.assignment14;

public class Tables {

	public static void main(String[] args) {
		System.out.println("The multiplication table >>>");

		for (int i = 2; i <= 20; i++) {
			for (int j = 1; j <= 10; j++) {

				int multi = i * j;
				System.out.println(multi);
			}

			System.out.println("**********************");
		}
	}
}
