package examples.program;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {

		int i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Starting Number:");
		int start = sc.nextInt();

		System.out.println("Enter Ending Number:");
		int end = sc.nextInt();

		for (i = start; i <= end; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j) {
				System.out.print(j + " ");
			}
		}

	}
}
