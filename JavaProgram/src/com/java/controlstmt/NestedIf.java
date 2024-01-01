package com.java.controlstmt;

public class NestedIf {

	public static void main(String[] args) {

		int age = 22;
		int weight = 45;
		if (age > 18) {
			System.out.println("Age is greater than 18");
			if (weight < 50) {
				System.out.println("You can donate the Blood");
			}

		}
	}

}
