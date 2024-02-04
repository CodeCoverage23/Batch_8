package com.assignment12;

import java.util.Scanner;

// Parent Class

public class Account {
	int accountNumber;
	String accountName;

	//get account details
	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Valid Account Number : ");
		accountNumber = sc.nextInt();

		System.out.println("Enter a Account Name : ");
		accountName = sc.next();

		getAccountInformation(accountNumber, accountName);

	}
	
	//print account details

	public void getAccountInformation(int accNum, String accName) {
		System.out.println("AccountNumber : " + accNum);
		System.out.println("AccountName : " + accName);
	}
}