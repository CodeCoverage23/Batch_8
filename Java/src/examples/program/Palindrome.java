package examples.program;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int rev = 0;

		for (int a = num; a > 0; a /= 10) {
			int rem = a % 10;
			rev = (rev * 10) + rem;
		}
		if (num == rev) {
			System.out.println("It's a palindrome number");
		} else {
			System.out.println("It's not a palindrome number");
		}
	}
}
