package com.java.oops;

/**
 * Compile time Polymorphism or Method Overloading
 */

public class Polymorphism2 {

	public static void main(String[] args) {

		System.out.println("I am main method called by JVM");
		Polymorphism2.main();
	}

	public static void main() {

		System.out.println("I am main method");

	}

	/*
	 * Method overloading is not possible by changing return type
	 * 
	 * public static void display(String s) {
	 * 
	 * System.out.println(s);
	 * 
	 * }
	 * 
	 * public static String display(String s) {
	 * 
	 * return s; }
	 */

}
