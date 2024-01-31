package com.assignment9;
//1. Write the Java program in which create the multiple objects and 
//display the count of number of objects created into class.
public class CountObject
 {
	
	static int count = 0;
	
	
	public CountObject() {
		count ++;
	}
	
	public static void getCount(){
		System.out.println("the object of count number : "+ count);
		
	}
	
	public static void main(String[] args) {
		
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		CountObject obj4 = new CountObject();
		CountObject obj5 = new CountObject();
		CountObject obj6 = new CountObject();
		CountObject obj7 = new CountObject();
		CountObject obj8 = new CountObject();
		CountObject obj9 = new CountObject();
		CountObject.getCount();
		
		
		
		
	}
}
