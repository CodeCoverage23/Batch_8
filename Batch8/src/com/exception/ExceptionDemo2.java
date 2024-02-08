package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {

			String s1 = null;

			s1.length();

			System.out.println(10 / 0);

		} catch (ArithmeticException e) {

			System.out.println("Inside arithmatic exception handler catch block" + e);
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");

	}

}
