package com.comments.constructor;

public class DefaultConstructor {

	int a;
	float b;

	DefaultConstructor() {
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}

	public static void main(String[] args) {

		DefaultConstructor demo = new DefaultConstructor();

	}

}
