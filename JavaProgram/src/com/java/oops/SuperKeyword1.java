package com.java.oops;

/**
 * Instance variable Demo
 */

class Parent {

	String company = "Steel";

}

public class SuperKeyword1 extends Parent {

	String company = "TATA";

	public void getNames() {
		System.out.println(company + super.company);
	}

	public static void main(String[] args) {
		SuperKeyword1 s = new SuperKeyword1();

		s.getNames();
	}

}
