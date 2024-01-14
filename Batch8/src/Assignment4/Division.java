package Assignment4;
//4. Write the java program to design method for division of two number 
//which returns int value to that method and result should be print into main method.

public class Division {
  public int div(int a, int b) {
	  return a % b;
  }
  public static void main(String[] arge) {
	  Division obj = new Division();
	  int s = obj.div(4, 8);
	  System.out.println("division of two number:" + s);
  }

}
