package com.java.controlstmt;

public class ReturnStatement {

	public static void main(String[] args) {

		int mul;
		for (int i = 1; i <= 10; i++) {
			mul = i * 5;
			System.out.println(mul);
			if (mul == 25) {
				break;
			}

		}

	}

}
