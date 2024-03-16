package com.assignment15;

import java.util.Scanner;

//Design class AccountDetails class in which below methods. 
//Public void getAccountDetails () 
//public static int getWithdrawDetails(Account account) 

public class AccountDetails {
	
	public void getaccountDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id >>");
		int id = sc.nextInt();
		System.out.println("enter the AccountNumber>>");
		String accountNumber = sc.next();
		System.out.println("enter the balance>>");
		double balance = sc.nextDouble();
		
		Account account = new Account();
		account.setId(id);
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);
		System.out.println(account);
		getWithdrawDetails(account);
	}
	
	public static double getWithdrawDetails(Account account) {
		double currentBalance = 0.0;
		System.out.println("enter the amount for withdrawl>>");
		Scanner sc= new Scanner(System.in);
		double withdrawAmount = sc.nextDouble();
		if (account.getBalance()>withdrawAmount) {
			currentBalance = (account.getBalance()- withdrawAmount);
			System.out.println("transcation successful");
            System.out.println("your current Balance is>> "+currentBalance);	
            
		}
		
		else {
			System.out.println("transcation unsuccessfull");
			System.out.println("your balance is insufficicent");
			
		}
		
		return currentBalance;
	}

}
