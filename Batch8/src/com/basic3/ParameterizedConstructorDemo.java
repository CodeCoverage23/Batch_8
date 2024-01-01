package com.basic3;

public class ParameterizedConstructorDemo {

	int a;

	String b;

	ParameterizedConstructorDemo(int data, String s) {
		a = data;
		b = s;

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		ParameterizedConstructorDemo p = new ParameterizedConstructorDemo(10, "Code");

	}
}
