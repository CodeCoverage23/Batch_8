package Assignment5;

import java.util.Scanner;

// 5. Write a program to check whether number is even or odd.
public class EvenNumber {
	public static void main( String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number is even or odd");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println(" the number is odd ");
		}
	}

}
