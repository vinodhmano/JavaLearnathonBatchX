package learnathon.batch15.day6.abstractclasses;

public class Geometry {
	public static void main(String[] args) {
		Triangle t = new Triangle(10,15,7,9);
		System.out.printf("Area of Triange is %.2f\n",t.Area());
		
		Square s = new Square(4);
		System.out.printf("Area of Square is %.2f\n",s.Area());
		
		
		Shape ss = new Square(8);
		ss.setColor("Red");
		System.out.printf("Area of Square is %.2f\n",ss.Area());
		
	
	}
}	
