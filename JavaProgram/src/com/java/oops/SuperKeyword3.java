package com.java.oops;

class Parent3 {

	Parent3() {
		System.out.println("Parent class constructor is created");
	}

}

public class SuperKeyword3 extends Parent3 {

	public SuperKeyword3() {
		System.out.println("Child class constructor is created");
	}

	public static void main(String[] args) {
		SuperKeyword3 s = new SuperKeyword3();

	}

}
