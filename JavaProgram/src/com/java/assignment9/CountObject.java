package com.java.assignment9;
// * create the multiple object and display the count of no of object created into the class

public class CountObject {
   static  int count =0;
   
   public CountObject()  {
	   count ++;
   }
   
	public static void main(String[] args) {
		
		CountObject obj1= new CountObject();
		CountObject obj2= new CountObject();
		CountObject obj3= new CountObject();
		CountObject obj4= new CountObject();
        CountObject obj5= new CountObject();

	CountObject.getCount();

	}
	public static void getCount(){
		System.out.println("No of object in class:" +count);
	}
		}

