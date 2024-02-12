package com.assignment15;

public class PolicyTest {
	public static void main(String[] args) {
		Policy policy = new Policy();

		Policy policyDetails = policy.getPolicyDetails();
		System.out.println("Policy Data is >>" + policyDetails);
	}
}
