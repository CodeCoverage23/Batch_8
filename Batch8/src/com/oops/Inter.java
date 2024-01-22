package com.oops;

public interface Inter {

	void metho1();

	void method2();

	static void method3() {
		System.out.println("static method from interface");
	}

	default void method4() {
		System.out.println("default method from interface");
	}
}
