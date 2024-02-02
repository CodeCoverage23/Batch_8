package com.string;

public class StringBufferDemo1 {

	public static void main(String[] args) {

		/*
		 * Mutable String object
		 */
		StringBuffer sb = new StringBuffer("Code");
		sb.append("Coverage");
		System.out.println(sb);

		/*
		 * Immutable String object
		 */
		String s1 = new String("Code");
		s1.concat("Coverage");
		System.out.println(s1);

		System.out.println(sb.reverse());

		sb.insert(1, "*******");
		System.out.println(sb);

		sb.replace(1, 2, "Coverage");
		System.out.println(sb);

		System.out.println(sb.delete(9, 15));
	}

}
