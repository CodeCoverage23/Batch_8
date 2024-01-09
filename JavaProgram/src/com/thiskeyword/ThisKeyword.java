package com.thiskeyword;

public class ThisKeyword {

	public static void main(String[] args) {

		ThisKeyword t = new ThisKeyword();
		ThisKeyword instance = t.getInstance();
		System.out.println(instance);

	}

	public ThisKeyword getInstance() {
		return this;

	}
}
