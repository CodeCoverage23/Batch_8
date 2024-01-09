package com.statickeyword;

public class StaticMethod1 {

	static int data = 10;

	public static void change() {
		data = 45;
	}

	public static void main(String[] args) {

		int a = 10;

		StaticMethod1.change();

		System.out.println(a + data );

	}

}
