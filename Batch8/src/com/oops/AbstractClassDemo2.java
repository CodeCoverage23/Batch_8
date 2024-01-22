package com.oops;

abstract class Shape {

	abstract public void draw();

}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("drawing circle..");

	}

}

class Tringle extends Shape {

	@Override
	public void draw() {
		System.out.println("Trangle circle..");

	}

}

public class AbstractClassDemo2 {

	public static void main(String[] args) {

		Tringle t = new Tringle();
		t.draw();

		Circle c = new Circle();
		c.draw();

	}
}
