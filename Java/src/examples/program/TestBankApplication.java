package examples.program;

import java.util.Scanner;

public class TestBankApplication {

	String accountNumber;
	double balance;

	public TestBankApplication(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	// Method to deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid amount to deposit...");
		}
	}

	// Method to withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrwan: " + amount);
		} else {
			System.out.println("Insufficient funds or invalid amount to withdraw...");
		}
	}

	// Method to check balance
	public double getBalance() {
		return balance;
	}

}
