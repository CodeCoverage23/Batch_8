package com.java.assignment12;

import java.util.Scanner;
//parent class
class Account{
	
	int accountNumber;
	String accountName;
	// get the account details
	public void getAcccountDetails() {
		System.out.println("Enter the Account Number>>");
		Scanner sc =new Scanner(System.in);
		accountNumber=sc.nextInt();
		System.out.println("enter the Account name>>");
		accountName=sc.next();
		getAccountInformation(accountNumber, accountName);
		
	}
	 //print the account details
	public void getAccountInformation(int accNum,String accName) {
		
		System.out.println("Account Number : "+accNum);
		System.out.println("Account Name : "+accName);
		
	}
}

