package com.oops;

/**
 * Invoke method from parent class
 */
class Parent2 {
	void eat() {
		System.out.println("Eating Lunch...");
	}
}

public class SuperKeywordDemo2 extends Parent2 {

	void eat() {
		System.out.println("Eating Breakfast...");
	}

	void study() {
		this.eat();
		super.eat();
	}

	public static void main(String[] args) {

		SuperKeywordDemo2 s = new SuperKeywordDemo2();
		s.study();

	}

}
