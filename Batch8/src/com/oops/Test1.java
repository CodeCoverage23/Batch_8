package com.oops;

public class Test1 implements Inter {

	@Override
	public void metho1() {
		System.out.println("implemented abstract method from inerface");

	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.metho1();
		t.method4();
		Inter.method3();

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}
}
