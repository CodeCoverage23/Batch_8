package game;

import java.util.Random;
import java.util.Scanner;

class game3{
	public int number;
	public int usereInput;
	public int NoGuess =0;
	
	public int getNoGuess() {
		return NoGuess;
	}
	public void setNoGuess(int NoGuess) {
		this.NoGuess = NoGuess;
	}
	game3(){
		Random  rand = new Random();
		this.number = rand.nextInt(100);
	}
	void usereInput() {
		System.out.println("guess the number");
		Scanner sc = new Scanner(System.in);
		this.usereInput=sc.nextInt();
	}
	boolean Iscorrectnumber() {
		NoGuess++;
		if(usereInput==number) {
			System.out.println("wooo hoooo you Guess a correct number");
			return true;
		}
		else if (usereInput<number) {
			System.out.println("the number you guess is to small");
			
		}
		else if (usereInput>number) {
			System.out.println("the number you guess is to big");
			
		}
		return false;
	}
	
}
public class NumGame {
	public static void main(String[] args) {
		game3 g = new game3();
		boolean b = false;
		while(!b) {
			g.usereInput();
			b=g.Iscorrectnumber();
		}
	}

}
