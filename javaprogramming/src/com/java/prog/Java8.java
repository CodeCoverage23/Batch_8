package com.java.prog;

@FunctionalInterface
interface Circle1{
 public void draw();	
}


public class Java8  {
	public static void main(String[] args) {

		Circle1 c=()->System.out.println("to draw circle");

		c.draw();
		
	}


}
