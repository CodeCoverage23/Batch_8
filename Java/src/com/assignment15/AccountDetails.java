package com.assignment15;

import java.util.Scanner;

//Design class AccountDetails class in which below methods. 
//Public void getAccountDetails () 
//public static int getWithdrawDetails(Account account) 

public class AccountDetails {

	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Id:");
		int id = sc.nextInt();
		System.out.print("Enter the Account Number:");
		String accountNumber = sc.next();
		System.out.print("Enter the Balance:");
		double balance = sc.nextDouble();

		Account account = new Account();
		account.setId(id);
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);
		System.out.println(account);
		getWithDrawDetails(account);

	}

	public static double getWithDrawDetails(Account account) {
		double currentBalance = 0.0;
		System.out.print("Enter the Amount for WithDrawl:");
		Scanner sc = new Scanner(System.in);
		double withDrawAmount = sc.nextDouble();

		if (account.getBalance() > withDrawAmount) {
			currentBalance = (account.getBalance() - withDrawAmount);
			System.out.println("TRANSACTION SUCCESSFULL...!");
			System.out.println("Your Current Balance is=" + currentBalance);
		} else {
			System.out.println("TRANSACTION UNSUCCESSFULL...!");
			System.out.println("Your Balance is  Unsufficient.");

		}

		return currentBalance;

	}

}
