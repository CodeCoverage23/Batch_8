package com.string;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "coverage";
		String s2 = "COVERAGE";

		int a = 10;

		Integer i = 20;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("o"));

		String string = s1.replace('o', 'O');
		System.out.println(s1);
		System.out.println(string);

		String s3 = " Code";
		System.out.println(s3.length());

		String trim = s3.trim();
		System.out.println(s3);
		System.out.println(trim);

		String join = String.join("-", s1, trim);
		System.out.println(join);

		System.out.println(s2.substring(0, 4));
		System.out.println(s2.substring(5));

		System.out.println(String.valueOf(a));

		System.out.println(i.toString());

	}

}
