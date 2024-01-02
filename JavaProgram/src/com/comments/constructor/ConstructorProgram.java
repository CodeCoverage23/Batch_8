package com.comments.constructor;

public class ConstructorProgram {

	public ConstructorProgram() {
		System.out.println("I am constructor...");
	}

	public static void main(String[] args) {

		ConstructorProgram c = new ConstructorProgram();

		c.demoMethod();
	}

	public void demoMethod() {
		System.out.println("I am method...");
	}

} 
