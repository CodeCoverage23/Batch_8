package com.java.assignment12;

import java.util.Scanner;

public class TestInsurance {

	public static void main(String[] args) {

		LifeInsurance a = new LifeInsurance();
		a.getInsuranceDetails();
		a.getLifeInsuranceDetails();

		System.out.println("*********************************");

		TermPolicy b = new TermPolicy();
		b.getTermPolicyDetalis();

	}

}

class Insurance {
	int id;
	String personName;
	String insuranceCompany;

}

class LifeInsurance extends Insurance {
	int premiumAmount;

	public void getInsuranceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a life insurance details >>> ");

		System.out.println("Enter id ...");
		id = sc.nextInt();

		System.out.println("Enter person name ...");
		personName = sc.next();

		System.out.println("Enter insurance company ...");
		insuranceCompany = sc.next();

		System.out.println("Enter premium amount ...");
		premiumAmount = sc.nextInt();

		getLifeInsuranceInformation(id, personName, insuranceCompany, premiumAmount);

	}

	public void getLifeInsuranceDetails() {
		
	}

	private void getLifeInsuranceInformation(int id, String personName, String insuranceCompany, int premiumAmount) {
		System.out.println("Id : " + id);
		System.out.println("Person Name : " + personName);
		System.out.println("Insurance Company : " + insuranceCompany);
		System.out.println("Premium Amount : " + premiumAmount);
	}

}

class TermPolicy extends LifeInsurance {
	int duration;

	public void getTermPolicyDetalis() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term policy details >>>");

		System.out.println("Enter id ...");
		id = sc.nextInt();

		System.out.println("Enter person name ...");
		personName = sc.next();

		System.out.println("Enter insurance company ...");
		insuranceCompany = sc.next();

		System.out.println("Enter premium amount ...");
		premiumAmount = sc.nextInt();

		System.out.println("Enter duration...");
		duration = sc.nextInt();

		getTermPolicyInformation(id, personName, insuranceCompany, premiumAmount, duration);

	}

	private void getTermPolicyInformation(int id, String personName, String insuranceCompany, int premiumAmount,
			int duration) {

		System.out.println("Id : " + id);
		System.out.println("Person Name : " + personName);
		System.out.println("Insurance Company : " + insuranceCompany);
		System.out.println("Premium Amount : " + premiumAmount);
		System.out.println("Duration : " + duration);
	}

}
