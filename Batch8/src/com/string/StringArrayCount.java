package com.string;

public class StringArrayCount {

	public static void main(String[] args) {

		String s[] = { "code", "coverage" };
		int count = 0;
		for (String s1 : s) {
			System.out.println(s1);
			count++;
		}
		System.out.println("Size of array  " + count);

	}

}
