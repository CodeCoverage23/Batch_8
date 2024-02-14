package com.exception;

/*
 *Nested try catch 
 * 
 */

public class ExceptionDemo3 {
	
	public static void main(String[] args) {
		
		try {
			/*
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
		
			try {
				
				String s1 = "12ab";
				int i = Integer.parseInt(s1);
				System.out.println(i); 
				
				} catch (NumberFormatException e) {
					System.out.println("Handeled number format exception");
				}
			/*
			 * 
			 * 
			 * 10 lines code 
			 * 
			 */
		}  catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	
	

}
