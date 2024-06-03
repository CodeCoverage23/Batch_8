package methodOverrinding;

class A{
	public int a;
	public int shreyash() {
		return 1;
	}
	public void yash() {
		System.out.println("i am yash 2 of class A");
	}
}
class B extends A{

	public void yash() {
		System.out.println("i am yash 2 of class b");
	}
	public void  yash2() {
		System.out.println("i am yash 3 of class c");
	}
}
public class Override {
	public static void main(String[] args) {
		A a = new A();
		a.yash();
		B b = new B();
		b.yash();
		b.yash2();
	}

}
