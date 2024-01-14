package Assignment4;
//3. Write the java program to design method for multiplication of two number
//which returns int value to that method and result should be print into main method.

public class Multiplication {
	public int mult(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] arge) {
		Multiplication obj = new Multiplication();
		int s = obj.mult(5, 5);
		System.out.println("Multiplication of two number " +s);
		
	}
	

}
