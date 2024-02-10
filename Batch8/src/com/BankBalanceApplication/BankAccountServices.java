package com.BankBalanceApplication;

import java.util.Scanner;

import com.ExceptionHandling.FundNotFoundException;

public class BankAccountServices {
	public static double balance = 7000;

	public static void main(String[] args) {
		System.out.println("<<---Welcome to code coverage bank--->>");
		menu();

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("menu :");
		System.out.println("press 1 : transfer money");
		System.out.println("press 2 : deposit money");
		System.out.println("press 3 : exit from the application");
		System.out.println("Enter a number of service : ");
		int n = sc.nextInt();
		run(n);
	}

	public static void run(int n) {
		switch (n) {
		case 1: {
			transfer();
			break;

		}
		case 2: {
			deposit();
			break;
		}
		case 3: {
			exit();
			break;
		}
		default: {
			System.out.println("<<--Please enter valid key..");
			System.out.println("---------------------------------------");
			menu();
		}
		}

	}

	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit : ");
		double amount = sc.nextDouble();
		balance += amount;
		System.out.println("Amount has been deposited successfully....");
		System.out.println("Current Balance : " + balance);
		System.out.println("---------------------------------------");
		menu();
	}

	public static void transfer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to transfer : ");
		double amount = sc.nextDouble();
		if (amount < balance) {
			balance -= amount;
			System.out.println("Amount has been transfered successfully...");
			System.out.println("Current Balance : " + balance);
			System.out.println("---------------------------------------");
			menu();

		} else {
			throw new FundNotFoundException("money to be transfer should be less than account balance ");

		}

	}

	public static void exit() {
		System.out.println("Thank you...Stay connected with code coverage bank....Have a nice day.");

	}

}
