package learnathon.batch15.day6.interfaces;

public class Laptop implements NonLivingThing{

	@Override
	public void manufacture() {
		System.out.println("New Laptop created");
		
	}

	@Override
	public void thrash() {
		System.out.println("Laptop destroyed");
		
	}

}
