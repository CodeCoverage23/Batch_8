package com.basic3;

public class ConstructorDemo1 {

	public ConstructorDemo1() {
		System.out.println("I am demo constructor...");
	}

	public static void main(String[] args) {

		ConstructorDemo1 c = new ConstructorDemo1();
		
		c.demoMethod();
	}

	public void demoMethod() {
		System.out.println("I am demo method..");
	}

}
