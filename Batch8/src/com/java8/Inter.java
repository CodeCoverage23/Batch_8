package com.java8;

/**
 * It should contain single abstract method
 */
@FunctionalInterface
public interface Inter {

	void abstarctMethod();

	// we can take multiple implemented methods in functional interface
	default void m1() {

	}

}
