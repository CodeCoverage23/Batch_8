package com.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1 = "Code";
		String s2 = "Coverage";

		// String concatenation using + operator
		System.out.println(12 + 12 + s1); // 24codee
		System.out.println(s1 + 12 + 12); // code24

		// String concatenation using concat method

		s1 = s1.concat(s2);

		System.out.println("S1 " + s1);

		System.out.println(s2.substring(4));
		
		String s4 = "c,v,b,n,m";
		
		String[] split = s4.split(",");
		
				
	}

}
