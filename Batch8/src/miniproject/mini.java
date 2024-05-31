package miniproject;

import java.util.Scanner;

public class mini {
   public static void main(String[] args) {
	   //mini project
	   Scanner sc = new Scanner(System.in);
	   int myNumber = (int)(Math.random()*100);
	   int userNumber = 0;
	   do {
		   System.out.println("guess my number (1-100");
		    userNumber = sc.nextInt();
		   
		   if(userNumber==myNumber) {
			   System.out.println("wooohooo .. CORRECT NUMBER!!!");
			   break;
		   }
		   else if(userNumber > myNumber){
			   System.out.println("your number is to large");
		   }
		   else {
			   System.out.println("your number is too small");
		   }
	   
	   }while(userNumber >=0);
	   System.out.println("my number was : ");
	   System.out.println(myNumber);
   }
}
