package com.java.oops;

/**
 * Final Variable
 */

public class Final1 {

	final int data = 10;

	/*
	 * Compile time error public void changeValue() { data = 20; }
	 */
	public static void main(String[] args) {
		Final1 f = new Final1();
		System.out.println(f.data);
	}

}
