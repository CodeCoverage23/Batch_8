package com.java.methods;

public class MethodTypes {

	public static void main(String[] args) {

		MethodTypes m = new MethodTypes();
		m.simpleMethod();

		int data = m.methodWithReturnType();
		System.out.println(data);

		int i = m.methodWithParameters(44, 2);
		System.out.println(i);
	}

	// 1
	public void simpleMethod() {
		System.out.println("Printing");
	}

	// 2
	public int methodWithReturnType() {
		int a = 2 + 3;
		return a;
	}

	// 3
	public int methodWithParameters(int a, int b) {
		return a + b;
	}
}
