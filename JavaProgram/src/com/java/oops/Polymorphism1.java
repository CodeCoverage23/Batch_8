package com.java.oops;

/**
 * Compile time Polymorphism or Method Overloading
 */

public class Polymorphism1 {

	public static void main(String[] args) {

		Polymorphism1 p = new Polymorphism1();

		int add = p.add(44, 22);
		System.out.println(add);
		System.out.println(p.add(55, 78, add));

		System.out.println("******Second Type******");

		p.mul(11.0f, 86l);

		p.mul(44, 44.44d);

		System.out.println(p.add(add, add));
	}

	/*
	 * First Type - By changing number of parameter
	 */

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	/*
	 * Second Type - By changing Data types
	 *
	 */

	public void mul(int a, double b) {
		System.out.println(a * b);
	}

	public void mul(float a, long b) {
		System.out.println(a * b);
	}

	public long add(long a, int b) {
		return a + b;
	}
}
