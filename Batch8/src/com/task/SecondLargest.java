package com.task;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element array contain : ");
		int n = sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest : "+a[n-2]);
		System.out.println("Largest : "+a[n-1]);
		System.out.println("Smallest : "+a[0]);
		
		

	}

}
