package com.basic3;

public class StaticMethodDemo2 {

	static int data = 10;

	public static void main(String[] args) {

		int a = 10;

		StaticMethodDemo2.change();

		System.out.println(a + data);

	}
	
	public static void change() {
		data = 45;
	}

	static {
		
	}
}
