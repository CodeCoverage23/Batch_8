package com.basic.programming;

public class SumAverage {
	public static void main(String[] args) {
		int english=75;
		int chemistry=80;
	    int biology=85;	
		int maths=70;
		int physics=50;
		
		int sum=english+chemistry+biology+maths+physics;
		System.out.println("Sum of total subjects:"+sum);
		
		float average=sum/5;
		System.out.println("Average of five subject:"+average);
		
	}

}
