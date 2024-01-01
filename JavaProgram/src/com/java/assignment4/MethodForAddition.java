package com.java.assignment4;

public class MethodForAddition {

	public static void main(String[] args) {

		MethodForAddition m = new MethodForAddition();
		int i = m.methodwithparameters(50, 2);

		System.out.println(i);

	}

	public int methodwithparameters(int a, int b) {
		return a + b;
	}
}
