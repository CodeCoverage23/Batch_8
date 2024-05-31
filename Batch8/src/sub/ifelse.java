package sub;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		age = sc.nextInt();
		 
		if (age>45) {
			System.out.println("you are eligible");
		}
		else if (age<78) {
			System.out.println(" you are adold");
		}
		else if (age>18) {
			System.out.println("you are younger");
		}
		else {
			System.out.println(" thanks");
			
		}
		
	}

}
