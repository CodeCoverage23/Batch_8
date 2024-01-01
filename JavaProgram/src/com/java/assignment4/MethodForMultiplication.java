package com.java.assignment4;

public class MethodForMultiplication {

	public static void main(String[] args) {
		
		MethodForMultiplication m = new MethodForMultiplication();
		int i = m.methodwithparameters(60, 8);

		System.out.println(i);

	}

	public int methodwithparameters(int a, int b) {
		return a * b;

	}

}
