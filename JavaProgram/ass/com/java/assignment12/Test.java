package com.java.assignment12;

import java.util.Scanner;

//Main class
public class Test {

	public static void main(String[] args) {

		SavingAccount saveAcc = new SavingAccount();
		saveAcc.getAccountDetails();
		saveAcc.getSavingAccountDetails();
	}
	
}

//Parent Class
	class Account {

		int accountNumber;
		String accountName;

		// get the account details
		public void getAccountDetails() {
			System.out.println("Enter the account number >>>");
			Scanner sc = new Scanner(System.in);
			accountNumber = sc.nextInt();
			System.out.println("Enter the account name >>>");
			accountName = sc.next();
			getAccountInformation(accountNumber, accountName);

		}

		// Print the account details
		public void getAccountInformation(int accNum, String accName) {

			System.out.println("Account Number : " + accNum);
			System.out.println("Account Name : " + accName);
		}

	}

//Child Class

	class SavingAccount extends Account {

		String accountType;
		long balance;

		// get saving account details
		public void getSavingAccountDetails() {
			System.out.println("Enter the account type >>>");
			Scanner sc = new Scanner(System.in);
			accountType = sc.next();
			System.out.println("Enter the balance >>>");
			balance = sc.nextLong();
			getSavingAccountInformation(accountType, balance);

		}
		// Print the saving account details

		public void getSavingAccountInformation(String accType, long balance) {

			System.out.println("AccountType : " + accType);
			System.out.println("Balance : " + balance);
		}

	}


