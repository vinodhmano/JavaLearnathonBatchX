package learnathon.batch15.day6.abstractclasses;

public abstract class Shape {

	private int sides;
	protected String color;
	
	public abstract double Area();
	public abstract double Perimeter();


	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 
	
	public void someShapeMethod() {
		System.out.println("Shape Method");
	}
	

}
