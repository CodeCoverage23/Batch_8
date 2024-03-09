package com.java8.functional.interfaces;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineInterfacesDemo {

	public static void main(String[] args) {

		// Predicate interface - conditional checks
		Predicate<Integer> p1 = t -> t == 100;
		boolean b = p1.test(40);
		System.out.println(b);
		System.out.println(p1.test(100));

		Predicate<String> p2 = t -> t.contains("J");
		System.out.println(p2.test("CODE"));

		// Function Interface - accept the parameter and gives the result
		Function<Integer, String> f1 = f -> f * f + " It is a square" + f;
		String apply = f1.apply(26);
		System.out.println(apply);

		Function<Integer, Integer> f2 = f -> f * f;
		System.out.println(f2.apply(50));

		Function<String, String> f3 = f -> f.toUpperCase();
		System.out.println(f3.apply("code coverage"));

		// Supplier - supplies the data
		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());

		Supplier<String> s2 = () -> UUID.randomUUID().toString();
		System.out.println(s2.get());

		// Accepts the data
		Consumer<String> c1 = c -> System.out.println(c);
		c1.accept("This is consumer interface implementation");

		Consumer<Integer> c2 = c -> {
			int i = c + 100;
			System.out.println(i);
		};
		c2.accept(100);
	}

}
