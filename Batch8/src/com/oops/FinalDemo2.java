package com.oops;
/**
 * Final method
 */
class Final {

	public final void finalMethod() {
		System.out.println("I am final method from Parent class");
	}
}

public class FinalDemo2 extends Final {

	/*
	 * Compile time error
	 * 
	 * @Override public void finalMethod() {
	 * System.out.println("I am final method"); }
	 */

	public static void main(String[] args) {

	}
}
