package com.assignment5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Year:");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100!= 0) ||( year % 400 == 0)) {
			System.out.println("It Is A Leap Year");
		} else {
			System.out.println("It Is Not A Leap Year");
		}
	}

}
