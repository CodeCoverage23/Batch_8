package com.comments.constructor;

public class ConstructorUsingStatic {

	static int data = 0;
	int num = 0;

	ConstructorUsingStatic() {
		data++;
		num++;

		System.out.println(data + " " + num);
	}

	public static void main(String[] args) {

		ConstructorUsingStatic c1 = new ConstructorUsingStatic();
		ConstructorUsingStatic c2 = new ConstructorUsingStatic();
		ConstructorUsingStatic c3 = new ConstructorUsingStatic();
		ConstructorUsingStatic c4 = new ConstructorUsingStatic();

	}

}
