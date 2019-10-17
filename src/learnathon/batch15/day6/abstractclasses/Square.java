package learnathon.batch15.day6.abstractclasses;

public class Square extends Shape {
	private int a;
	
	public Square(int a) {
		this.setSides(4);
		this.a = a;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return a * a;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 4*a;
	}
	
	public void printSquareSomething() {
		System.out.println("This is a Square");
	}

}
