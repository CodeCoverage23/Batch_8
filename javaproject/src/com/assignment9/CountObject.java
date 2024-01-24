package com.assignment9;
/**
 * create the multiple object and display the count of number of object created into  class
 */
   public class CountObject {
	static int count = 0;
	
	// Default Constructor
	public CountObject() {
	
		count++;
	}

	  public static void main(String[] args) {
		
		CountObject obj1= new CountObject();
		CountObject obj2= new CountObject();
		CountObject obj3= new CountObject();
		CountObject obj4= new CountObject();
		CountObject obj5= new CountObject();
		CountObject obj6= new CountObject();
		CountObject obj7= new CountObject();
		
		CountObject.getCount();
	}

	    public static void getCount() {
		
		System.out.println(" Number of Object in class is : " + count);
	}

}
   
