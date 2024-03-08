package com.java8;

import java.util.function.Predicate;

interface SimpleMethod{
	void printTable();
}

interface MethodWithParameters{
	void add(int a,int b);
}
@FunctionalInterface
interface MethodWithReturnType{
	int square(int a);
}

public class DemoLEExamples {
	public static void main(String[] args) {
		
		SimpleMethod sm=() ->System.out.println("Keep it up...");
		sm.printTable();
		
		MethodWithParameters ad=(a,b) ->System.out.println(a+b);
		ad.add(2,3);
		
		MethodWithReturnType sq=a->a*a;
		int square = sq.square(13);
		System.out.println(square);
		
		Predicate<Integer> p=e->e>10;
		System.out.println(p.test(5));
		
	}


}
