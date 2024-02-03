package com.cc.extra;

public class ReversString {

	public static void main(String[] args) {

		String s1 = "Code Coverage";// egarevoC edoC

		char c;

		String rvs = "";

		for (int i = 0; i < s1.length(); i++) {

			c = s1.charAt(i);

			rvs = c + rvs;
		}

		System.out.println("Reversed String : " + rvs);
	}

}
