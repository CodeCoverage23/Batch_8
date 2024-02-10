package com.ExceptionHandling;

public class TestException2Insufficient {

	public static void main(String[] args) throws InsufficientFundException {
		int balance=5000;
		if(balance<6000) {
			throw new InsufficientFundException("Fund not Found");
		}
		else {
			System.out.println("Transfered.....");
		}

	}

}
