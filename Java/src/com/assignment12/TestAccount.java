package com.assignment12;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount();
		acc.getAccountDetails();
		acc.getSavingAccountDetails();

	}

}

//child class
class SavingAccount extends Account {

	String accountType;
	long balance;

	public void getSavingAccountDetails() {

		System.out.println("Enter a account type : ");
		Scanner sc = new Scanner(System.in);
		accountType = sc.next();

		System.out.println("Enter Balance : ");
		balance = sc.nextLong();

		getSavingAccountInformation(accountType, balance);

	}

	public void getSavingAccountInformation(String accType, long balance) {

		System.out.println("Account Type : " + accType);
		System.out.println("Balance " + balance);

	}

}