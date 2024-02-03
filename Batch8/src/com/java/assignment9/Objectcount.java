package com.java.assignment9;

//Write the java program in which creat the multiple objects and display the count of number.

public class Objectcount {
	
	static int count = 0;
	
	//Dafult constructor
	
	public  Objectcount() {
		count++;
	}
	
	public static void getcount( ) {
		System.out.println("number of object in class is :" + count);
	}

	public static void main(String[] args) {
		 Objectcount obj1 = new Objectcount();
		 Objectcount obj2 = new Objectcount();
		 Objectcount obj3 = new Objectcount();
		 Objectcount.getcount();
		 
	}

}
