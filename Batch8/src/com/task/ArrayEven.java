package com.task;

public class ArrayEven {

	public static void main(String[] args) {
		int []a= {2,33,45,34,23,54,67,86,44,33};
		System.out.println("Printing even numbers in array : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
