package com.java.prog;

interface Circle {

	public void draw();

	public void display();
}

public class CoreJava implements Circle {

	@Override
	public void draw() {
		System.out.println("to draw circle");
	}

	@Override
	public void display() {
		System.out.println("to display circle");
	}
public static void main(String[] args) {
	
	CoreJava obj=new CoreJava();
	obj.draw();
	obj.display();
	
	
	
}
}
