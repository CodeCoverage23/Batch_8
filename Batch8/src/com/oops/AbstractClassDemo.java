package com.oops;

/**
 * Abstract class demo
 * 
 */
abstract class Demo {

	abstract public void method1();

	public void method2() {
		System.out.println("Non abstract method from abstract class");
	}
}

public class AbstractClassDemo extends Demo {

	@Override
	public void method1() {
		System.out.println("Implemented abstract method");

	}

	public static void main(String[] args) {
		AbstractClassDemo a = new AbstractClassDemo();
		a.method1();
		a.method2();
	}
}
