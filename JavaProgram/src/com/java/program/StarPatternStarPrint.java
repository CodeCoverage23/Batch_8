package com.java.program;

public class StarPatternStarPrint {

	public static void main(String[] args) {

		int i, j, row = 6;
		// outer loop work for row
		for (i = 0; i <= row; i++) {
			// inner for loop work for space
			for (j = row - i; j > 0; j--) {

				System.out.print(" ");
			}
			// for loop work for print *
			for (j = 0; j <= i; j++) {

				System.out.print("* ");

			}
//throws the cursor in new line
			System.out.println();

		}
	}
}
