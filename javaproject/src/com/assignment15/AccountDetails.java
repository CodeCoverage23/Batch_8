package com.assignment15;

import java.util.Scanner;

public class AccountDetails {
	
	
	public void getAccountDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter Account Number : ");
		String accountNumber=sc.next();
		
		System.out.println("Enter the Balance");
		double balance=sc.nextDouble();
	
		Account account=new Account();
		
		account.setId(id);
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);
		
		getWithdrawDetails(account);
		
	}

	public static double getWithdrawDetails(Account account) {

		double currentBalance = 0.0;

		System.out.println("enter the amount for withdrawl>>");
		Scanner sc = new Scanner(System.in);
		double withdrawAmount = sc.nextDouble();

		if (account.getBalance() > withdrawAmount) {
			currentBalance = (account.getBalance() - withdrawAmount);

			System.out.println("transaction successful");
			System.out.println("your Current Balance is >>" + currentBalance);
		} else {

			System.out.println("transaction Faild");
			System.out.println("your balance is insufficient");
		}
		return currentBalance;
	}

}
