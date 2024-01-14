package Assignment5;

import java.util.Scanner;

//2.write a program to check whether year is leap year or not. (If else stmt).
public class leepyear {
	public static void main ( String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter the number to check leepyear" );
		int num = sc.nextInt();
		 
		if  (num %4==0 && num % 100!=0 || num%400==0 ) {
			System.out.println("the given year is leep year" );
		}else {
			System.out.println(" the given year is not leep year" );
		}
		
		}

}
