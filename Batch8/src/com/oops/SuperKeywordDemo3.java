package com.oops;

class Parent3 {

	Parent3() {
		System.out.println("Parent class constructor is created");
	}

}

public class SuperKeywordDemo3 extends Parent3 {

	public SuperKeywordDemo3() {
		System.out.println("Child class constructor is created");
	}

	public static void main(String[] args) {
		SuperKeywordDemo3 s = new SuperKeywordDemo3();

	}

}
