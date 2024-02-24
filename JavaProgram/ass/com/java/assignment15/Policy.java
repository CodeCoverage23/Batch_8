package com.java.assignment15;

// Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
// Design the below method into Policy class and which return the policy object
// public Policy getPolicyDetails() 
// Input should be taken from user and print that data into getPolicyDetails () method.

import java.util.Scanner;

public class Policy {

	private int id;
	private String policyName;
	private String policyType;
	private int premiumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getPremiunAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiunAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Policy getPolicyDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Id >>>");
		id = sc.nextInt();

		System.out.println("Enter the Policy Name >>>");
		policyName = sc.next();

		System.out.println("Enter the Policy Type >>>");
		policyType = sc.next();

		System.out.println("Enter the Premiun Amount >>>");
		premiumAmount = sc.nextInt();

		Policy policy = new Policy();
		policy.setId(id);
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPremiumAmount(premiumAmount);

		return policy;
	}

	@Override
	public String toString() {
		return "Policy [id =" + id + " , policyName =" + policyName + " , policyType =" + policyType
				+ " , premiumAmount =" + premiumAmount + "]";

	}

	public static void main(String[] args) {
		Policy policy = new Policy();

		Policy policyDetails = policy.getPolicyDetails();
		System.out.println("policy data is >> " + policyDetails);

	}

}
