package basic3;

public class ConstuctorClass {

	
	static int data = 0;
	int num = 0;

	ConstuctorClass() {
		data++;
		num++;

		System.out.println(data + " " + num);
	}

	public static void main(String[] args) {

		ConstuctorClass c1 = new ConstuctorClass();
		ConstuctorClass c2 = new ConstuctorClass();
		ConstuctorClass c3 = new ConstuctorClass();
		ConstuctorClass c4 = new ConstuctorClass();

	}
}
