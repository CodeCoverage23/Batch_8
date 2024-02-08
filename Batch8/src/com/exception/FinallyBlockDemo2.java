package com.exception;

/*
 * Without handling exception
 */
public class FinallyBlockDemo2 {

	public static void main(String[] args) {

		try {

			String s = "12.23";
			Integer i = Integer.valueOf(s);
			System.out.println(i);

		} catch (ArithmeticException e) {

			System.out.println("Can not divide by ZERO");
		} finally {

			System.out.println("I will always execute...");

		}
		System.out.println("rest of the code");

	}
}
