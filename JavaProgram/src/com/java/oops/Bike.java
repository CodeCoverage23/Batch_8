package com.java.oops;

class Vehicle {

	public void run() {
		System.out.println("Vehicle is running...");
	}

}

/**
 * Method Overriding Demo
 */
public class Bike extends Vehicle {

	@Override
	public void run() {
		System.out.println("Bike is running...");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
	}

}
