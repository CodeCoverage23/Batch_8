package Assignment5;

import java.util.Scanner;

//6. Write the program to check whether the no is greater than 100.
public class graternumber {
    public static void main(String[] arge) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("the number is greater than 100");
    	int num = sc.nextInt();
    	if(num>100) {
    		System.out.println("the number is greater than 100");
    	}else {
    		System.out.println("the number is smaller than 100");
    	}
    	
    }

}
