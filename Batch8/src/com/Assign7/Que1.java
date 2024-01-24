package com.Assign7;

import java.util.Scanner;

//1. Design method to check whether the character is alphabet, 
//digit and special symbol.
public class Que1 {
	public void checkChar(char c) {
		if((c>='a'&& c<='z') ||(c>='A'&& c<='Z') ){
			System.out.println(c + " is a Character ");
			
		}
		else if(c>='0'&&c<='9') {
			System.out.println(c + " is a Digit ");
		}
		else {
			System.out.println(c + " is a Symbol");
		}
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Character to check : ");
			char c = sc.next().charAt(0);
			Que1 s=new Que1();
			s.checkChar(c);


	}

}
