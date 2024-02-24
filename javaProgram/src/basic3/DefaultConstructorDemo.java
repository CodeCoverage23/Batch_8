package basic3;

public class DefaultConstructorDemo {

	

	int a;
	float b;

	DefaultConstructorDemo() {
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}

	public static void main(String[] args) {

		DefaultConstructorDemo demo = new DefaultConstructorDemo();

	}


}
