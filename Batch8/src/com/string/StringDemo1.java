package com.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// 1st way to create string group
		char c[] = { 'c', 'o', 'd', 'e' };

		for (char c1 : c) {
			System.out.println(c1);
		}

		String s1 = new String(c);

		System.out.println(s1);

		// 2nd way to create string group

		String s2 = "code"; // String literal 

		System.out.println(s2);

		// 3rd way to create string group

		String s3 = new String("Code"); // new keyword
		System.out.println(s3);
		
		System.out.println(s3.charAt(0));

	}
}
