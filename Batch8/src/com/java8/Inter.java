package com.java8;
@FunctionalInterface
public interface Inter {
	//it should contain single abstract method 
	void abstractMethod();
	
	//we can take  multiple implemented methods in functional interface 
	default void m1() {
		
	}
	
}
