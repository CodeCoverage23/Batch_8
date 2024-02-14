package com.exception;

public class ExceptionDemo1 {
	
	
	public static void main(String[] args) {
		
		
		int data = 10;
		
		System.out.println("before division"); 
		
	
		//System.out.println(data/0);
		
		System.out.println("after division");
		
		int a[] = {1,2,3,4,5,6};
		
		for (int i = 0; i<=a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		
		String s1 = "code";
		
		//char c = s1.charAt(data);
		
		
		try {
			
			
		String s2 = null;
		
		System.out.println(s2.length()); 
		
		} catch (NullPointerException e) {
			System.out.println("NUll pointer exception");
		}

	}

}

		
		

		
		
		

	
	
	
	


