package com.Assign9;
//Write the Java program in which create the multiple objects and display the count of number of
//objects created into class.
public class Que1 {
	static int objectCount=0;
	public Que1() {
		objectCount++;
	}
	public static int getObjectCount() {
		return objectCount;
	}

	public static void main(String[] args) {
		Que1 a1=new Que1();
		Que1 a2=new Que1();
		Que1 a3=new Que1();
		Que1 a4=new Que1();
		
		System.out.println(" the number of objects created are : "+ getObjectCount() );
	}

}
