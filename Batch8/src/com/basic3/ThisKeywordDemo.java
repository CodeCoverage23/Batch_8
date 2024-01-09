package com.basic3;

public class ThisKeywordDemo {

	ThisKeywordDemo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		ThisKeywordDemo t = new ThisKeywordDemo();
		ThisKeywordDemo instance = t.getInstance();
		System.out.println(instance);

	}

	public ThisKeywordDemo getInstance() {

		return this;
	}

}
