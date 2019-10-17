package learnathon.batch15.day6.abstractclasses;

public class Triangle extends Shape{
	
	private int a;
	private int b;
	private int c;
	private int h;
	
	public Triangle(int a, int b, int c, int h) {
		this.setSides(3);
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return 0.5 * b * h;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}
	
	public void printTriageSomething() {
		System.out.println("This is a triange");
	}

	

}
