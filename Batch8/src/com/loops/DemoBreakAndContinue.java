package com.loops;

/**
 * @author System
 * @since 2023
 */
public class DemoBreakAndContinue {

	/**
	 * This is main method
	 * 
	 * @param args String type array
	 */
	public static void main(String[] args) {

		int mul; // local variable

		for (int i = 1; i <= 10; i++) {

			mul = i * 5;

			/*
			 * We are skipping the value of mul variable if mul == 25
			 */
			if (mul == 25) {
				continue;
			}
			System.out.println(mul);

		}

	}

}
