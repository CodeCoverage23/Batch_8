package com.java.programmingpp;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 40;

//	    boolean statement= a<++b & b<++c;
		boolean or = ++a > b | a < ++c;

//		System.out.println(statement);
		System.out.println(or);

		System.out.println(a);
		System.out.println(c);
	}
}
