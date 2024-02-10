package com.ExceptionHandling;

import java.util.Scanner;

public class TestException {
	static int accountBalance=6000;

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the money to be transfer : ");
	int moneyToBeTransfer =sc.nextInt();
	if(moneyToBeTransfer<accountBalance) {
		System.out.println("Money has been Transfered : "+moneyToBeTransfer);
		//remaining ammount in account 
		accountBalance-=moneyToBeTransfer;
		System.out.println("remaining account Balance : "+accountBalance);
	}
	else {
		throw new FundNotFoundException("money to be transfer should be less than account balance ");
	}

	}

}
