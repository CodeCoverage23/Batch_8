package Assignment6;

import java.util.Scanner;

// Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
//5*1=5.......5*10=50)
public class multiplicationTable {
	public void multiplication(int no) {
		System.out.println("table of " + no);
		for(int i = 1; i<=10; i++) {
			System.out.println(no + "*" + i + "=" + no * i);
			
		}
	}
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
			multiplicationTable obj = new multiplicationTable();
			obj.multiplication(n);
		}
			
	}



