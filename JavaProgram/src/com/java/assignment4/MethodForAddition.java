package com.java.assignment4;

// Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.

public class MethodForAddition {

	public static void main(String[] args) {

		MethodForAddition m = new MethodForAddition();
		int i = m.add(50, 2);

		System.out.println(i);

	}

	public int add(int a, int b) {
		return a + b;
	}
}
