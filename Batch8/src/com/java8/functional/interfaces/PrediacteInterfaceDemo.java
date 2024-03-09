package com.java8.functional.interfaces;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrediacteInterfaceDemo {

	public static void main(String[] args) {
		
		//predicate interface -comditional checks
		Predicate<Integer> p1 = t -> t == 100;
		boolean b = p1.test(40);
		System.out.println(b);
		System.out.println(p1.test(100));
		
		Predicate<String> p2 = t -> t.contains("c");
		boolean b2 = p2.test("code");
		System.out.println(b2);
		
		//functional interface - accept the paramaeters and gives the result
		
		Function<Integer,String> f1 = f ->f*f+" It Is a square of "+f;
		String apply = f1.apply(26);
		System.out.println(apply);
		
		Function<Integer,Integer> f2 = f ->f*f;
		System.out.println(f2.apply(25));
		
		Function<String,String> f3 = f ->f.toUpperCase();
		System.out.println(f3.apply("jiya naik"));
		
		
		//supplier interface- supplies the data 
		
		Supplier<Double> s1=()->Math.random();
		System.out.println(s1.get());
		
		Supplier<String> s2=()->UUID.randomUUID().toString();
		System.out.println(s2.get());
		
		//consumer interface
		
		Consumer<String> c1=c->System.out.println(c);
		c1.accept("this is cosumer class interface implementation");
		
		Consumer<Integer> c2=c ->{
			int i=c+100;
			System.out.println(i);
		};
		c2.accept(20);
	}

}
