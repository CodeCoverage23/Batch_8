package com.assignment4;
//4. Write the java program to design method for division of two number 
//which returns int value to that method and result should be print into main method.
public class Division {
	
	//division of two number
	public int div(int k, int h) {
		return k % h;
		
	}
	public static void main(String[] args) {
		Division obj = new Division();
		int g = obj.div(9, 7);
		System.out.println("division of two number:" +g);
		
	}

}
