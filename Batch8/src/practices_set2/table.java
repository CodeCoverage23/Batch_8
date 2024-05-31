package practices_set2;

import java.util.Scanner;

public class table {
	static void multiplication(int n) {
		System.out.println("print table of "+ n);
		for(int i=1; i<=10; i++) {
			System.out.format("%d X %d =%d\n" ,n, i, n*i);
		}
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number :");
	int a = sc.nextInt();
	table obj = new table();
	obj:multiplication(a);
	}

}
