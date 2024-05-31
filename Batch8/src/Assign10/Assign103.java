package Assign10;

import java.util.Scanner;

//3. Write java program to check whether number is Armstrong or not.(A positive number is called
//armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
//Let's try to understand why 153 is an Armstrong number.
//153 = (1*1*1)+(5*5*5)+(3*3*3)
public class Assign103 {
	public static boolean isArmstrong(int num) {
		int originalNum, remainder , result = 0, n = 0;
		originalNum = num;
		while(originalNum != 0) {
			originalNum  /= 10;
			n++;
		}
		originalNum = num;
		while (originalNum !=0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, n);
			originalNum /= 10;
			
		}
		return result == num;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check whether is armstrong number or not : ");
		int n = sc.nextInt();
		if (isArmstrong(n)) {
			System.out.println(n + "is aarmstrong number . ");
		}else {
			System.out.println(n + "is not a armstrong number . ");
		}
	}

}
