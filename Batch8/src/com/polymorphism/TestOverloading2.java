package com.polymorphism;

public class TestOverloading2 {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		TestOverloading2 s = new TestOverloading2();
		System.out.println(s.add(10, 20));
		System.out.println(s.add(20, 20));

	}

}
