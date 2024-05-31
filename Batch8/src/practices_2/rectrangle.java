package practices_2;

import java.util.Scanner;

class rec{
	 int length;
	 int brigth ;
	 public int area() {
		 return length *brigth;
		 
	 }
	 public int parametar() {
		 return 2*length*brigth;
	 }
}
public class rectrangle {
	public static void main(String[] args) {
		
		 rec r = new rec();
		 r.brigth=7;
		 r.length=4;
		 System.out.println( "the area if rectranle is :" + r.area());
		 System.out.println( "the perameter of rectrangle is :" + r.parametar());
		 
		 
		

		
		
	}

}
