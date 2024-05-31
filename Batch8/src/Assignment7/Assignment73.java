package Assignment7;

import java.util.Scanner;

// Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
//(Enter the no=125 then output will be 521)

public class Assignment73 {
	public int getReversnumber(int num) {
		int rev = 0;
		while (num > 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num /= 10;
			
		}
		return rev;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find its reverce :");
		int num = sc.nextInt();
		Assignment73 a = new Assignment73();
		System.out.println(a.getReversnumber(num));
		
		
	}
	
}
		


