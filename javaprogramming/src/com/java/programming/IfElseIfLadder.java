package com.java.programming;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a marks to check the grade :");
		int marks = sc.nextInt();
		if (marks > 0) {

			if (marks < 40) {
				System.out.println("the given student is fail");
			}

			else if (marks >= 40 && marks < 50) {

				System.out.println("D grade");
			} else if (marks >= 50 && marks < 60) {
				System.out.println("C grade");

			} else if (marks >= 60 && marks < 70) {

				System.out.println("B grade");

			} else if (marks >= 70 && marks < 80) {
				System.out.println("A grade");
			} else if (marks >= 80 && marks < 100) {

				System.out.println("A++ grade");

			} else {

				System.out.println("invalid marks");
			}
		} else {
			System.out.println("please enter a valid marks");

		}

	}
}
