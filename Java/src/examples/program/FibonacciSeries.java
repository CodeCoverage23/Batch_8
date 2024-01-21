package examples.program;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int a=0,b=1,c;
	
	System.out.println("Enter the Range:");
	
	Scanner s=new Scanner(System.in);
	
	int range=s.nextInt();
	
	for(int i=1;i<=range;i++) {
		
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
