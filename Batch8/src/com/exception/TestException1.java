package com.exception;

import java.util.Scanner;

public class TestException1 {

	static int accountBalance = 6000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		int moneyToBeTransfer = sc.nextInt();

		if (moneyToBeTransfer < accountBalance) {
			System.out.println("Money has been transfered : " + moneyToBeTransfer);
			// print the account balance
		} else {
			System.out.println("Your account balance is : " + accountBalance);
			throw new FundNotFoundException("Transfer money should be less than account balance");
		}

	}

}
