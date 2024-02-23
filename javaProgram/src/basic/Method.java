package basic;

public class Method {
	
	public static void main(String[] args) {

		Method m = new Method(); // m - reference variable for object MethodDemo

		m.simpleMethod();

		int data = m.methodWithReturnType();
		System.out.println(data);
		int i = m.methodWithParameters(44, 2);
		System.out.println(i);

		System.out.println(Math.sqrt(16));

		m.methodWithParameters(45, 45);

	}

	// 1
	public void simpleMethod() {
		System.out.println("Printing...");
	}

	// 2
	public int methodWithReturnType() {
		int a = 2 + 3;
		return a;
	}

	// 3
	public int methodWithParameters(int a, int b) {
		return a + b;
	}

}

