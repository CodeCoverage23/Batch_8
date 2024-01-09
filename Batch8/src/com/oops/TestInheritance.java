package com.oops;

class P {

	int data;
	
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P {
	public void m2() {
		System.out.println("Child");
	}
}

public class TestInheritance {

	public static void main(String[] args) {

		// First scenario
		P p = new P();
		p.m1();
		// p.m2(); CE - Compile time Error

		// Second scenario
		C c = new C();
		c.m1();
		c.m2();

		// 3rd Scenario
		P p1 = new C();
		p1.m1();
		// p1.m2(); CE

		// 4TH Scenario
		// C c = new P();

	}

}
