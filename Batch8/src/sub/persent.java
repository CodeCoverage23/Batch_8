package sub;

import java.util.Scanner;

public class persent {
	public static void main (String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your physics mark");
		int physics = sc.nextInt();
		System.out.println("enter your chemestry mark");
		int chemestry = sc.nextInt();
		System.out.println("enter your english marks");
		int english = sc.nextInt();
		System.out.println("enter your maths marks");
		int maths = sc.nextInt();
		System.out.println("enter your science marks");
		int science = sc.nextInt();
		 
		 int total=(physics + chemestry + english + maths + science);
		float percentage = (total)/500.0f*100;
		System.out.println("percentage : ");
		System.out.println(percentage);
		
	}

}
