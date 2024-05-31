package practices_set2;

import java.util.Scanner;

public class sumofevenNo {
	public static int sum(int n){
		
		if(n<=1){
			return n;
		}else {	
				return n + sum(n-1);
		
			
		}
	
	}
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print number ");
		int s = sc.nextInt();
		if(s <0) {
			System.out.println("please enter apositive integer. ");
		}else {
			int suum=sum(s);
			System.out.println("the sum of the first " + s + " natural number is : " +suum);
		}
		sc.close();
	}
	

}
