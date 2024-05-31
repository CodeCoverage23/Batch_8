package Game2;

import java.util.Random;
import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take 1 to 100 ");
		int userInput =sc.nextInt();
		Random r = new Random();
		int computer= r.nextInt();
		
		if(userInput == computer) {
			System.out.println(" you win! ");
		}else if(userInput>computer) {
			System.out.println("the number is grater ");
		}else{
			System.out.println("the number is smaller");
		}
		System.out.println();
	}

}
