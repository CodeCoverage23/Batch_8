package com.java.programmingpp;

public class SwitchProgram {

	public static void main(String[] args) {
		
		int num=5 ;
		String month="";
		
		switch(num) {
		
		case 1 :
			month="January";
			break;
			
		case 2 :
			month="February";
			break;
			
		case 3 :
			month="March";
			break;
			
		case 4 :
			month="April";
			break;
			
		case 5 :
			month="May";
			break;
			
			default :
				System.out.println("Please enter a valid number");
				
		}

		System.out.println(month);
	}

}
