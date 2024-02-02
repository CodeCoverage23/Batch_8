package com.assignment13;

import java.util.Scanner;

/*Then design the new class called as AccountImpl and implement that method,
 * below input should be taken from user as name and balance into getSavingAccount 
 * method and pass input and print it into getUserDetails method.
 * */

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
		System.out.println("Enter the name>>");
		name = sc.next();

		System.out.println("Enter the balance>>");
		balance = sc.nextFloat();

		getAccountDetails(name, balance);

	}

	@Override
	public void getAccountDetails(String name, float balance) {
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);

	}

}
