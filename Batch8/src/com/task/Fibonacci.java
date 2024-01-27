package com.task;

public class Fibonacci {
	
	public static void main(String[] args) {
		int a1=0;
		int a2=1;
		System.out.print(a1+" "+a2+" ");
		for(int i=3;i<10;i++) {
			int temp=a1+a2;
			System.out.print(temp+" ");
			//sorting
			a1=a2;
			a2=temp;
			temp=a1;
		}

	}

}
