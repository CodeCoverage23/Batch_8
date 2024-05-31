package sub;

import java.util.Scanner;

public class equation {
	public static void main(String[]arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print v ");
		int v = sc.nextInt();
		System.out.println("print u ");
		int u = sc.nextInt();
		System.out.println("print a ");
		int a = sc.nextInt();
		System.out.println(" print s ");
		int s = sc.nextInt();
		
		int j = (v*v-u*u)/(2*a*s);
		System.out.print("value of j is: ");
	System.out.println(j);

}
}