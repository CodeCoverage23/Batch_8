package com.java.controlstmt;

public class ContinueStatement {

	public static void main(String[] args) {

		int mul;
		for (int i = 1; i <= 10; i++) {
			mul = i * 5;
			if (mul == 25) {
				continue;
			}
			System.out.println(mul);

		}

	}
}
