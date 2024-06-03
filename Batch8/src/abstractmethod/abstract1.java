package abstractmethod;

abstract class parent{
	public parent(){
		System.out.println("i am constracter of parent ");
	}
	public void sayhello() {
		System.out.println("hello");
	}
	abstract public void greet();
	abstract public void greet2();
}
class Child extends parent{
	@Override
	public  void greet() {
		System.out.println("good morning");
	}
	@Override
	public void greet2() {
		System.out.println("good afternoon");
	}
}
abstract  class child2 extends parent{
	public void the() {
		System.out.println("i am good");
	}
}
public class abstract1 {
public static void main(String[] args) {
	Child c = new Child();
}
}
