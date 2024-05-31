package Assign9;
//Write the Java program in which create the multiple objects and display the count of number of
//objects created into class.
public class Assign91 {
	static int objectcount = 0;
	public Assign91() {
		objectcount++;
	}
	public static int getobjectcount() {
		return objectcount;
		
	}
	public static void main (String[] args) {
		Assign91 a1 = new Assign91();
		Assign91 a2 = new Assign91();
		Assign91 a3 = new Assign91();
		Assign91 a4 = new Assign91();
		System.out.println("the number of object created are : "+ getobjectcount() );
		
		
	}
	

}
