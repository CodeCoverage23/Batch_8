package Assignment5;
//3.write a program to find out maximum number among three number(if else if ladder statement)
public class GreaterNumber {
	public static void main(String[] arge) {
		int a=10;
		int b = 20;
		int  c = 30;
		if( a > b && a > c) {
			System.out.println("the greatest number among three is : " + a);
		}else if(b > a && b > c){
			System.out.println("the greatest number among three is : " + b);
		}else if(c > a && c > b){
			System.out.println("the greatest number among three is : " + c);
		}else {
			System.out.println("the greatest number among three is invalid");
		}
	}

}
