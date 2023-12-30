package examples.program;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a input value:");
		int ip = sc.nextInt();

		switch (ip) 
		{
		case 2, 3, 4, 5: 
		{
			System.out.println("Summer Season");
			break;
		}
		case 6, 7, 8, 9: 
		{
			System.out.println("Winter Season");
			break;
		}
		case 10, 11, 12, 1: 
		{
			System.out.println("Rainy Season");
			break;
		}
		default: 
		{
			System.out.println("Enter a valid input...");
		}
		}
	}
}
