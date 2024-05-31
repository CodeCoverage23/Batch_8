package sub;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		age = sc.nextInt();
		
		switch (age){
		
		case 18:
		    System.out.println("your young");
		    break;
		case 56:
		    System.out.println("your old");
		    break;
		   default:
			   System.out.println("enjoy your life");
		}
		System.out.println("thanks");
	}

}
