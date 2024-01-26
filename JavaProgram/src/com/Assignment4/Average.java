package com.Assignment4;
//Average of 5 subject

public class Average {

	public static void main(String[] args) {
		System.out.print("Average of five :");
		System.out.println( Average.average());
	}
  public static int average() {
	  int a=10; 
	  int b=30; 
	  int c=20;
	  int d=40;
	  int e=50;
	  int Avg= a+b+c+d+e;
	  int Avg1=Avg/5;
	  
	  return Avg1;
  }
}
