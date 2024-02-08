package com.exception;

/*
 * By handling exception
 */

public class FinallyBlockDemo1 {

	public static void main(String[] args) {

		try {

			System.out.println(10 / 0);

		} catch (ArithmeticException e) {

			System.out.println("Can not divide by ZERO");
		} finally {

			System.out.println("I will always execute...");

		}

		System.out.println("rest of the code");
	}

}
