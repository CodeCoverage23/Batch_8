package com.java.oops;

/**
 * Invoke method from parent class
 */
class Parent2 {
	void eat() {
		System.out.println("Eating Lunch...");
	}
}

public class SuperKeyword2 extends Parent2 {

	void eat() {
		System.out.println("Eating Breakfast...");
	}

	void study() {
		this.eat();
		super.eat();
	}

	public static void main(String[] args) {

		SuperKeyword2 s = new SuperKeyword2();
		s.study();

	}

}
