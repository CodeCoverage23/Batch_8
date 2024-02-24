package basic3;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I am demo constructor...");
	}

	public static void main(String[] args) {

		ConstructorDemo c = new ConstructorDemo();
		
		c.demoMethod();
	}

	public void demoMethod() {
		System.out.println("I am demo method..");
	}

}

