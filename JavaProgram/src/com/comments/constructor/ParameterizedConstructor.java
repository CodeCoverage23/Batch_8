package com.comments.constructor;

public class ParameterizedConstructor {

	int a;
	String b;

	ParameterizedConstructor(int data, String s) {
		a = data;
		b = s;

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		ParameterizedConstructor p = new ParameterizedConstructor(10, "Code");

	}

}
