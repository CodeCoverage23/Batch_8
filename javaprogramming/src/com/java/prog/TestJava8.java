package com.java.prog;

interface Drawable{
	
	public void circle();
	
	default void rectangle() {
		
		System.out.println("this is rectangle");
		
	}
	
	public static void triangle() {
		System.out.println("this is triangle");
	}
}





public class TestJava8 {

	public static void main(String[] args) {

		Drawable draw=()->System.out.println("this is circle");
		draw.circle();
		System.out.println();
		draw.rectangle();
		System.out.println();
		Drawable.triangle();
		
		
	}

}
