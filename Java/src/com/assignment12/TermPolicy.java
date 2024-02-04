package com.assignment12;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance {
	int duration;

	public void getTermPolicyDetails() {
		System.out.println("Enter Term Policy Details >>");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Id : ");
		id = sc.nextInt();

		System.out.println("Enter Person Name : ");
		personName = sc.next();

		System.out.println("Enter Insurance Company : ");
		insuranceCompany = sc.next();

		System.out.println("Enter Premium Amount : ");
		premiumAmount = sc.nextInt();

		System.out.println("Enter Duration : ");
		duration = sc.nextInt();

		getTermPolicyInformation(id, personName, insuranceCompany, premiumAmount, duration);
	}

	private void getTermPolicyInformation(int id, String personName, String insuranceCompany, int premiumAmount,
			int duration) {
		System.out.println("Id : " + id);
		System.out.println("Person Name : " + personName);
		System.out.println("Insurance Company : " + insuranceCompany);
		System.out.println("Premium Amount : " + premiumAmount);
		System.out.println("Duration : " + duration + ": years ");

	}
}
