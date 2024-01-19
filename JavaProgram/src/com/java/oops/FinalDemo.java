package com.java.oops;

/**
 * Final method
 */

class Final2 {

	public final void finalMethod() {
		System.out.println("I am final method from Parent class");
	}
}

public class FinalDemo extends Final2 {

	/*
	 * Compile time error
	 * 
	 * @Override public void finalMethod() {
	 * System.out.println("I am final method"); }
	 */

	public static void main(String[] args) {

	}
}
