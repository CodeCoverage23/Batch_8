package InharitenceAndOverloding;

class base{
	base(){
		System.out.println("i am in");
	}
	base(int x){
		System.out.println("my name is shreyash :" +x);
	}
}
class base1 extends base{
		base1(){
			System.out.println("i take a coffe");
		}
		
		base1( int x, int y){
			super(x);
			System.out.println("my father name is ashok :"+ y);
		}
}
class base2 extends base1{
			base2(){
				System.out.println("now i am relax");
			}
			base2(int x, int y ,int z) {
				super(x,y);
				System.out.println("my surname is chaurase :" + z);
			}
}
	

public class myclass {
	public static void main(String[] args) {
		base2 b2 = new base2();
		
		
	
	}
}
