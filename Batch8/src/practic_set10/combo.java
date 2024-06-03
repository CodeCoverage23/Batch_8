package practic_set10;

class circle{
	public int radius;
	circle(int r){
		System.out.println("i am circle parameterized constructor");
		this.radius=r;
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
}
class cylinder extends circle{
	public int hight;
	cylinder(int r,int h){
		super(r);
		System.out.println("i am cylinder");
		this.hight=h;
		
	}
	
	public double volume() {
		return Math.PI*this.radius*this.radius*this.hight;
	}
}
public class combo {
	public static void main(String[] args) {
		//circle c = new circle(12);
		cylinder s = new cylinder(12,23);
	}

}
