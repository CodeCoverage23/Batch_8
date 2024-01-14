package Assignment4;
//2. Write the java program to design method for substraction of two number
//which returns int value to that method and result should be print into main method.
public class Substraction {
	public int sub(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] arge) {
		Substraction obj = new Substraction();
		int s = obj.sub(4, 2);
		System.out.println("Substraction of two number" +s);
	}

}
