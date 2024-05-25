package com.inheritance;
class Animal{
	public void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("barking...");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("meow...");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		System.out.println("Hierarchical inheritance : two or more class inherits same class ");
		System.out.println();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("Dog : ");
		dog.eat();
		dog.sound();
		System.out.println();
		System.out.println("Cat : ");
		cat.eat();
		cat.sound();

	}

}
