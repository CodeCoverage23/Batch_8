package com.polymorphism;
class Vehicle{
	public void run() {
		System.out.println("vehicle is running...");
	}
}
class Car extends Vehicle{
	public void run() {
		System.out.println("car is running...");
	}
}

public class OverridingTest1 extends Car{

	public static void main(String[] args) {
		OverridingTest1 v = new OverridingTest1();
		v.run();

	}

}
