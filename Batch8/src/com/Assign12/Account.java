package com.Assign12;

import java.util.Scanner;

public class Account {
	int accountNumber;
	String accountName;
	public void getAccountDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Account Number : ");
		accountNumber=sc.nextInt();
		
		System.out.println("Enter an Account Name : ");
		accountName=sc.next();
		
		getAccountInformation(accountNumber,accountName);
		
		}
	public void getAccountInformation(int accountNumber,String accountName) {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Name : " + accountName);
	}
	public static void main(String args[]) {
		Account a=new Account();
		a.getAccountDetails();
	}

}
