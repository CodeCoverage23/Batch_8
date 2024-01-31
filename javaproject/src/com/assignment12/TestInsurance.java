package com.assignment12;
// Multilevel Inheritance
import java.util.Scanner;

 public class TestInsurance {
	 
	 public static void main(String[] args) {
		 //first child class object calling
		 LifeInsurance lifeinsurance=new LifeInsurance();
		 lifeinsurance.getLifeInsuranceDatails();
		 
		System.out.println(" ------------------ ");
		
		 //second child Class object calling
		 TermPolicy termpolicy=new TermPolicy();
		 termpolicy.getTermPolicyDetails();
		 termpolicy.getLifeInsuranceDatails();
	}
 }
//parent class to achieve Multilevel Inheritance 
	 class Insurance {
   
	int id;
	String personName;
	String insuranceCompany;
	
	 }
	// first chlid class to achieve inheritance 
	class LifeInsurance extends Insurance{
		 int premiumAmount;
		
		public void getLifeInsuranceDatails() {
			Scanner sc= new Scanner (System.in); 
			System.out.println(" Enter a Life Insurance Details >> ");
			System.out.println(" Enter id ");
			id =sc.nextInt();
			
			System.out.println(" Enter Person Name : ");
			personName=sc.next();
			
			System.out.println(" Enter Insurance Company : ");
		    insuranceCompany=sc.next();
		    
		    System.out.println(" Enter Premium Amount ; ");
		    premiumAmount=sc.nextInt();
		    getLIfeInsuranceInformation(id,personName,insuranceCompany,premiumAmount);    
		}
		private void  getLIfeInsuranceInformation(int id, String personName, String insuranceCompany, int premiumAmount) {
			System.out.println(" Id : "+id);
			System.out.println(" Person Name : "+ personName);
			System.out.println(" Insurance Company : "+insuranceCompany);
			System.out.println(" Premium Amount : "+premiumAmount);
		}
	}
// second child class to achieve inheritance 
	class TermPolicy extends LifeInsurance{
		int duration;
		
		public void getTermPolicyDetails() {
			
			System.out.println(" Enter Term Policy details >> ");
			Scanner sc= new Scanner (System.in); 
			
			System.out.println(" Enter id ");
			id =sc.nextInt();
			
			System.out.println(" Enter Person Name : ");
			personName=sc.next();
			
			System.out.println(" Enter Insurance Company : ");
		    insuranceCompany=sc.next();
		    
		    System.out.println(" Enter Premium Amount : ");
		    premiumAmount=sc.nextInt();
			System.out.println(" Enter Duration : ");
			duration=sc.nextInt();
			getTermPolicyInformation(id,personName,insuranceCompany,premiumAmount,duration);
			
		}
		
		private void getTermPolicyInformation(int id, String personName, String insuranceCompany, int premiumAmount, int duration) {
			
			System.out.println(" Id : "+id);
			System.out.println(" Person Name : "+ personName);
			System.out.println(" Insurance Company : "+insuranceCompany);
			System.out.println(" Premium Amount : "+premiumAmount);
			System.out.println(" duration : "+duration+" : yeras ");
			
		}
	}
	
	
	
	
	
	
	
	

