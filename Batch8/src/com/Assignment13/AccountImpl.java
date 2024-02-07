package com.Assignment13;

import java.util.Scanner;

public class AccountImpl implements Account {
	
	public static void main(String[] args) {
		AccountImpl impl = new AccountImpl();
		impl.getSavingAccount();
	}

	@Override
	public void getSavingAccount() {
		String name;
		float balance;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name>>");
		name = sc.next();

		System.out.println("enter the balance>>");
		balance = sc.nextFloat();

		getAccountDetails(name, balance);

	}

	@Override
	public void getAccountDetails(String name, float balance) {
		System.out.println("name : " + name);
		System.out.println("balance : " + balance);

	}

}


