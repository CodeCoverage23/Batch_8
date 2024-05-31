package sub;

import java.util.Scanner;

public class passornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("math");
		int m1,m2,m3;
		m1=sc.nextInt(); 
			System.out.println("physic");
		m2=sc.nextInt();
		System.out.println("chemistry");
		m3=sc.nextInt();
		
		
		float avg =(m1+m2+m3)/3.0f;
		System.out.println("percentage is: " + avg);
		if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("congratulation, you are pass");
			
		}
		else {
			System.out.println("you are fail");
		}
		
	}

}
