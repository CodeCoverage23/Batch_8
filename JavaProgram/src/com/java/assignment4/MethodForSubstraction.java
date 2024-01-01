package com.java.assignment4;

public class MethodForSubstraction {

	public static void main(String[] args) {

		MethodForSubstraction m = new MethodForSubstraction();
		int i = m.methodwithparameters(80, 22);

		System.out.println(i);

	}

	public int methodwithparameters(int a, int b) {
		return a - b;

	}

}
