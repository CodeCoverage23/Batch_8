package sub;

import java.util.Scanner;

public class leafyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long year = sc.nextLong();
		if(year % 4==0  && year %100!=0 || year %400==0 ) {
			System.out.println("this is  leaf year");
		}
		else {
			System.out.println("this is not  leaf  year");
		}
		
	}

}
