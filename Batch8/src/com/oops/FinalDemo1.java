package com.oops;

/**
 * Final Variable
 */
public class FinalDemo1 {

	final int data = 10;

	/*
	 * Compile time error 
	 * public void changeValue()
	 * { 
	 * data = 20; 
	 * }
	 */
	public static void main(String[] args) {
		FinalDemo1 f = new FinalDemo1();
		System.out.println(f.data);
	}

}
