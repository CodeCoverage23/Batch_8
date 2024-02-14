package com.assignment15;

import java.util.Scanner;

//Design the policy class that contain policy id ,policy name,policy type, premium amount etc.


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
	
	
	public String getpolicyName()  {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	public String getpolicyType() {
		return policyType;
		
	}
	
	public int getpremiumAmount() {
		return premiumAmount;
		
	}
	
	public void setpremiumAmount(int premiumAmount) {
		
		this.premiumAmount = premiumAmount;
		
	}
	
	public Policy getpolicyDetails() {
		
		
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter policy Id>>");
         id = sc.nextInt();
         System.out.println("Enter the policy name");
         policyName =sc.next();
         System.out.println("Enter the policytype>>");
         policyType = sc.next();
         System.out.println("Enter the premiumAmount>>");
         premiumAmount=sc.nextInt();
         
         
         Policy policy = new Policy();
         policy.setId(id);
         policy.setPolicyName(policyName);
         policy.setPolicyName(policyType);
         policy.setpremiumAmount(premiumAmount);
         
         return policy;
         
	}
	
	@Override
	
	public String toString() {
		
		return "policy[id=" + id + " ,policyName="+policyName+" , policyType=" +policyType+ " , premiumAmount="
				+premiumAmount + "]";
		
	}
	
	
}




