package com.assignment12;

import java.util.Scanner;

//first child class to achieve inheritance

public class LifeInsurance extends Insurance {
	int premiumAmount;

	public void getLifeInsuranceDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Life Insurance Details >>");
		System.out.println("Enter Id >>");
		id = sc.nextInt();

		System.out.println("Enter Person Name : ");
		personName = sc.next();

		System.out.println("Enter Insurance Company : ");
		insuranceCompany = sc.next();

		System.out.println("Enter Premium Amount : ");
		premiumAmount = sc.nextInt();

		getLifeInsuranceInformation(id, personName, insuranceCompany, premiumAmount);

	}

	private void getLifeInsuranceInformation(int id, String personName, String insuranceCompany, int premiumAmount) {

		System.out.println("Id: " + id);
		System.out.println("Person Name: " + personName);
		System.out.println("Insurance Company: " + insuranceCompany);
		System.out.println("Premium Amount: " + premiumAmount);

	}
}
