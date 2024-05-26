package com.polymorphism;
//method overloading : by changing number of parameters

public class TestOverloading1 {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		TestOverloading1 s = new TestOverloading1();
		System.out.println(s.add(10, 20));
		System.out.println(s.add(20, 20, 20));

	}

}
