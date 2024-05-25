package com.Assign12;

import java.util.Scanner;

public class SavingAccount extends Account{
	String  accountType;
	long balance;
	public void getSavingAccountDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a account type : ");
		accountType=sc.next();
		
		System.out.println("Enter Balance : ");
		balance=sc.nextLong();
		
		getSavingAccountInformation(accountType,balance);
	
	}
	public void getSavingAccountInformation(String acType,long balance) {
		System.out.println("Account Type : " + acType);
		System.out.println("Balance " + balance);
	}
	public static void main(String args[]) {
		SavingAccount a=new SavingAccount();
		a.getAccountDetails();
		a.getSavingAccountDetails();
	}
}
