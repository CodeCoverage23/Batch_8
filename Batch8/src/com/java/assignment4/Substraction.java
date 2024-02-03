package com.java.assignment4;
//Write the java program to design method for substraction of two number returns int value to that method and result should be print into m
//and result should beprint into main method.                    
public class Substraction {
	
	public static void main(String[] args) {
		Substraction OBJ= new Substraction();
		System.out.println(OBJ.sub(20, 10));
		
	}

     public int sub(int a , int b) {
    	 int c=a-b;
    	 return c;
     }
     
     
     
}
