package com.string;

public class StringDemo3 {

	public static void main(String[] args) {

		String s1 = "Code";
		String s2 = "Code";
		String S3 = new String("Code");
		String s4 = "Coverage";

		boolean equals = s1.equals(s2);
		/*
		 * First way of string comparison by equals method : content comparison
		 */
		System.out.println(equals); // true
		System.out.println(s1.equals(S3)); // true
		System.out.println(s1.equals(s4)); // false
		System.out.println("---------------------------------------");
		/*
		 * Second way of string comparison by == operator : reference/address comparison
		 */
		System.out.println(s1 == s2); // true
		System.out.println(s1 == S3); // false
		System.out.println(s1 == s4); // false

	}

}
