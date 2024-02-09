package com.exception;

public class ThreowKeywordDemo1 {

	public static void main(String[] args) {

		String s1 = "code Coverage is an institute";

		if (s1.length() <= 10) {
			throw new StringIndexOutOfBoundsException("String is lenth is not 10 digits");
		} else {
			System.out.println("We can proceed with the string");
		}

	}

}
