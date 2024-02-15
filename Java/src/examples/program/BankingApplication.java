package examples.program;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestBankApplication account = new TestBankApplication("37890988024");

		while (true) {
			System.out.println("Account Number : " + account.accountNumber);
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter the Input: ");
			int ip = sc.nextInt();

			switch (ip) {
			case 1:
				System.out.println("Enter the amount to deposit: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;

			case 2:
				System.out.println("Enter the amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;

			case 3:
				System.out.println("Your Balance is: " + account.getBalance());
				break;

			case 4:
				System.out.println("Thank You for using our banking application.");
				sc.close();
				System.exit(ip);

			default:
				System.out.println("Invalid Input! Please try again...");

			}

		}
	}
}
