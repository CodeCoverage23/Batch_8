package com.oops;

/**
 * Instance variable Demo
 */
class Parent {

	String company = "Steel";

}

public class SuperKeywordDemo1 extends Parent {

	String company = "TATA";

	public void getNames() {
		System.out.println(company + super.company);
	}

	public static void main(String[] args) {
		SuperKeywordDemo1 s = new SuperKeywordDemo1();

		s.getNames();
	}

}
