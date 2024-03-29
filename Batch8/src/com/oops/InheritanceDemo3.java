package com.oops;

/**
 * Implementation of Multilevel inheritance
 */
public class InheritanceDemo3 {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();

		d.legs = 4;
		d.walk();
		d.bark();
		d.eat();
		System.out.println(d.legs);
	}
}

class Dog extends Animal {

	public void bark() {

		System.out.println("Barking...");

	}

}

class BabyDog extends Dog {

	public void eat() {
		System.out.println("Eating...");
	}

}