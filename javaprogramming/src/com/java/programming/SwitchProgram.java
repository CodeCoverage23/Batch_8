package com.java.programming;

public class SwitchProgram {

	public static void main(String[] args) {

		int num = 7;
		String month = "";

		switch (num) {

		case 1:
			month = "january";
			break;
		case 2:
			month = "february";
			break;
		case 3:
			month = "march";
			break;
		case 4:
			month = "april";
			break;
		default:
			System.out.println("please enter a valid number");

		}
		System.out.println(month);

	}

}
