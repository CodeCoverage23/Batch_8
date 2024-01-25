package com.assignment9;

public class CountObject {

	static int count = 0;

	public CountObject() {
		count++;
	}

	public static void getCount() {
		System.out.println("Number of objects in class is : " + count);
	}

	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		CountObject obj4 = new CountObject();
		CountObject obj5 = new CountObject();
		CountObject.getCount();
	}

}
