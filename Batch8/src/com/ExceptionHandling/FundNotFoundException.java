package com.ExceptionHandling;

public class FundNotFoundException extends RuntimeException {

	public FundNotFoundException(String msg) {
		super(msg);
	}

}
