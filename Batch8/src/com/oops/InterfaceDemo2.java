package com.oops;

interface Inter2 {
	void add(int a, int b);
}

interface Inter3 {
	void add(int a, int b);
}

public class InterfaceDemo2 implements Inter3, Inter2 {

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		InterfaceDemo2 i = new InterfaceDemo2();
		i.add(11, 44);

	}
}
