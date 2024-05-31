package logic;

public class logic1 {
	static int logic2(int x, int y) {
		int z;
		if (x>y) {
			z = x+y;
		}
		else {
			z = (x+y)*5;
		}
		return z;
	}
    
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;
		logic1 obj = new logic1();
		c = obj. logic2(a , b);
		int a1 =2;
		int b1 = 1;
		int c1;
		c1 =obj. logic2(a1 , b1);
		System.out.println(c);
		System.out.println(c1);
	}
}
