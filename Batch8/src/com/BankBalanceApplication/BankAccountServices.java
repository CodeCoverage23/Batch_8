package com.BankBalanceApplication;

import java.util.Scanner;

import com.ExceptionHandling.FundNotFoundException;

public class BankAccountServices {
	public static double balance = 7000;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("<<---Welcome to code coverage bank--->>");
		menu(sc);

	}

	public static void menu(Scanner sc) {
		System.out.println("menu :");
		System.out.println("press 1 : withdraw money");
		System.out.println("press 2 : deposit money");
		System.out.println("press 3 : exit from the application");
		System.out.println("Enter a number of service : ");
		int n = sc.nextInt();
		run(n,sc);
	}

	public static void run(int n,Scanner sc) {
		switch (n) {
		case 1: {
			withdraw(sc);
			break;

		}
		case 2: {
			deposit(sc);
			break;
		}
		case 3: {
			exit();
			break;
		}
		default: {
			System.out.println("<<--Please enter valid key..");
			System.out.println("---------------------------------------");
			menu(sc);
		}
		}

	}

	public static void deposit(Scanner sc) {
		System.out.println("Enter the amount to deposit : ");
		double amount = sc.nextDouble();
		balance += amount;
		System.out.println("Amount has been deposited successfully....");
		System.out.println("Current Balance : " + balance);
		System.out.println("---------------------------------------");
		menu(sc);
	}

	public static void withdraw(Scanner sc) {
		System.out.println("Enter the amount to withdraw : ");
		double amount = sc.nextDouble();
		if (amount < balance) {
			balance -= amount;
			System.out.println("Amount has been transfered successfully...");
			System.out.println("Current Balance : " + balance);
			System.out.println("---------------------------------------");
			menu(sc);

		} else {
			throw new FundNotFoundException("money to be transfer should be less than account balance ");

		}

	}

	public static void exit() {
		System.out.println("Thank you...Stay connected with code coverage bank....Have a nice day.");

	}

}
