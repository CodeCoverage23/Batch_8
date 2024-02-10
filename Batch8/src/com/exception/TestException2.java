package com.exception;

public class TestException2 {

	public static void main(String[] args) throws InsufficientFundException {
		int balance = 7000;

		if (balance > 6000) {
			throw new InsufficientFundException("Fun not found...");
		} else {
			System.out.println("Transfered....");
		}
	}

}
