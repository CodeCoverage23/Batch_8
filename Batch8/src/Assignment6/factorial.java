package Assignment6;

import java.util.Scanner;

// . Design method int fact orial(int no)  which returns int value to that method. print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
public class factorial  {
	public int factor(int no) {
		int fact=1;
		if(no ==1 || no ==0) {
		return 1;	
		
		}
		return no * factor(no-1);
	
	}
	public static void main (String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" print  factorial  ");
		int no = sc.nextInt();
		factorial obj = new factorial();
		
		System.out.println(no + "!=" + obj.factor(no) );
			
	}

}
