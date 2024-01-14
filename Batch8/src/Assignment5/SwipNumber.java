package Assignment5;
//8. Write a program to swap the two numbers.
public class SwipNumber {
	public static void main(String[] arge) {
		//using third variable 
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("number before swapping");
		System.out.println("a :" +a+ "& b :" +b);
		
//	    temp=a;
//	    a=b;
//	    b=temp;
//	    
//	    System.out.println("the number after Swapping");
//	    System.out.println("a :"+a+ " & b : "+b);
//	    
	    
	    //without using third varaible
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("the number affter swapping");
		System.out.println("a :" +a+ "& b : "+b);
	}

}
