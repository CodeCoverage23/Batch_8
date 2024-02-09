package com.ExceptionHandling;

public class ThrowKeywordDemo1 {

	public static void main(String[] args) {
		String s1 = "coverage";
		// String s2="code coverage"; //it will proceed

		if (s1.length() <= 10) {
			throw new StringIndexOutOfBoundsException("String length is not greater than 10");

		} else {
			System.out.println("We can proceed with the string");
		}

	}

}
