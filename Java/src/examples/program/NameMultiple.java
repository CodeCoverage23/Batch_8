package examples.program;

import java.util.Scanner;

public class NameMultiple {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to print name multiple:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i + ":DHANANJAY DOKE");
			} else if (i % 5 == 0) {
				System.out.println(i + ":DHANANJAY");
			} else if (i % 7 == 0) {
				System.out.println(i + ":DOKE");
			} else {
				System.out.println(i);
			}
		}
	}
}