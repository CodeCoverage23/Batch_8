 package com.java.oops;

/**
* Implementation of simple inheritance
*/

public class Inheritance1 {

public static void main(String[] args) {

		Cat c = new Cat();

		c.legs = 4;

		c.walk();
		c.meow();

		System.out.println(c.legs);
	}

}

class Animal {

	int legs;

	public void walk() {
		System.out.println("Walking...");
	}

}

class Cat extends Animal {

	public void meow() {
		System.out.println("meow meow...");
	}
}
