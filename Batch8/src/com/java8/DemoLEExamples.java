package com.java8;

import java.util.function.Predicate;

interface SimpleMethod {
	void printable();
}

interface MethodWithParameters {
	void add(int a, int b);
}

@FunctionalInterface
interface MethodWithReturnType {
	int squareIt(int a);
}

public class DemoLEExamples {

	public static void main(String[] args) {

		SimpleMethod sm = () -> System.out.println("Coce coverage");
		sm.printable();

		MethodWithParameters mp = (a, b) -> System.out.println(a + b);
		mp.add(10, 10);

		MethodWithReturnType mr = a -> a * a;
		int squareIt = mr.squareIt(12);
		System.out.println(squareIt);

		Predicate<Integer> p = e -> e > 10;
		System.out.println(p.test(5));

		Predicate<String> p1 = e -> e.length() < 50;
		System.out.println(p1.test("Java"));

	}
}
