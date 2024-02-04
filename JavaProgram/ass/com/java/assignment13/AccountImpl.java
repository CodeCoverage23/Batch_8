package com.java.assignment13;

//Then design the new class called as AccountImpl and implement that method, below input should be taken from user as name and balance into getSavingAccount method and pass input and print it into getUserDetails method.

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
		System.out.println("Enter the name >>>");
		name = sc.next();

		System.out.println("Enter the balance >>>");
		balance = sc.nextFloat();

		getUserDetails(name, balance);

	}

	@Override

	public void getUserDetails(String name, float balance) {
		System.out.println("name : " + name);
		System.out.println("balance : " + balance);
	}

}
