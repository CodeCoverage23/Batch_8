package com.array;

public class ArrayDemo2 {

	public static void main(String[] args) {

		String s[] = new String[3];

		s[0] = "ABC";
		s[1] = "LMN";
		s[2] = "XYZ";

		for (String s1 : s) {
			System.out.println(s1);
		}

		String s1[] = { "Code", "Coverage" };

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

	}

}
