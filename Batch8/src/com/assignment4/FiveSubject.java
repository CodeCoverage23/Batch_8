package com.assignment4;
//5. Write the Java Program to calculate total of five subject marks and average of it.
public class FiveSubject {
	
	public static void main(String[] args) {
		//five subject marks
		int math = 75;
		int science = 67;
		int English = 89;
		int marathi = 80;
		int chemistry = 70;
		
		int total = math+science+English+marathi+chemistry;//total of subject
		System.out.println("total of five subject:" +total);
		int average = total/5; //average of subject
		System.out.println("average of five subject:" + average);
	}

}
