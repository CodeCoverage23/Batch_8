package Assignment7;

import java.util.Scanner;

//  Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.
public class Assignment71 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("hte factor of "+num+"is :");
		Assignment71.getNumber(num);
	}
	public static void getNumber(int num) {
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	 

}
