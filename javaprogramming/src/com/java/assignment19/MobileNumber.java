package com.java.assignment19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//1. Write program to add the five students mobile number 
//into arraylist and iterate that elements using iterator. 

public class MobileNumber {
     
	public static void main(String[] args) {
       List<String> list=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("enter the mobile number >>");
			Scanner sc=new Scanner(System.in);
			String mobileNumber = sc.next();
			list.add(mobileNumber);
			
			
		}
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
