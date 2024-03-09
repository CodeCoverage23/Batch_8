package com.assignment15;

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

	public int getPremimumAmount() {
		return premiumAmount;
	}

	public void setPremimumAmount(int premimumAmount) {
		this.premiumAmount = premimumAmount;
	}

	public Policy getPolicyDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Id : ");
		id = sc.nextInt();

		System.out.println("Enter Policy Name : ");
		policyName = sc.next();

		System.out.println("Enter policy Type : ");
		policyType = sc.next();

		System.out.println("Enter Premimum Amount : ");
		premiumAmount = sc.nextInt();

		Policy policy = new Policy();

		policy.setId(id);
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPremimumAmount(premiumAmount);

		return policy;

	}

	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyName=" + policyName + ", policyType=" + policyType + ", premiumAmount="
				+ premiumAmount + "]";
	}

}