package learnathon.batch15.day6.abstractclasses;

public class Pentagon extends MultiSidedFigure{

	int length;
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return ((1/4) * Math.sqrt(5*(5 + 2*(Math.sqrt(5)))) * (length * length));
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void printPentagonSomething() {
		System.out.println("This is a Pentagon");
	}
	
}
