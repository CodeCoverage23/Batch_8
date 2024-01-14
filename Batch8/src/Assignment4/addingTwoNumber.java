package Assignment4;
//1. Write the java program to design method for addition of two number 
//which returns int results to that method and result should be print into main method
public class addingTwoNumber {
	public int addition(int a, int b) { 
		return a+b;
	}
	public static void main(String[] arge) {
		addingTwoNumber obj = new addingTwoNumber();
		int s = obj.addition(5, 6);
		System.out.println("addingTwoNumber: " +s);
				
	}
	
}
	
	