package com.java.assignment9;

// Write the java program in which create the multiple objects and display the count of number of objects created into class.

public class ObjectCount {

	static int count = 0;

	// Default constructor

	public ObjectCount() {
		count++;
	}

	public static void getCount() {
		System.out.println("Number of objects in class is : " + count);
	}

	public static void main(String[] args) {
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount.getCount();

	}

}
