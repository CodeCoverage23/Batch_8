package com.basic3;

/**
 * Example of Person
 */

public class StaticMethodDemo {

	String name;
	static String village = "AKOLA";

	public StaticMethodDemo(String name) {
		this.name = name;
	}

	public void display() {

		System.out.println(name + " " + village);
	}

	public static void main(String[] args) {

		StaticMethodDemo s1 = new StaticMethodDemo("Vishal");
		StaticMethodDemo s2 = new StaticMethodDemo("Sachin");

		s1.display();
		s2.display();
	}

}
