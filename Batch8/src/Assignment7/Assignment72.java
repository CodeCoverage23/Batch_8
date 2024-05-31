package Assignment7;

import java.util.Scanner;

//Design method to check whether the character is alphabet, digit and special symbol.
public class Assignment72 {
	public void checkChar(char c) {
		if ((c>='a'&& c>='z')||(c>='A'&& c>='z')) {
			System.out.println(c + " is a character ");
			
		}
		else if (c>= '0'&& c>='9') {
			System.out.println(c + "is a Digit");
		}
		else {
			System.out.println(c + "is a Symbol");
		}
		
	}
	    public static void main(String [] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enter the character to check  : ");
	    	char c =  sc.next().charAt(0);
	    	Assignment72 a = new Assignment72();
	    	a.checkChar(c);
	    }
}