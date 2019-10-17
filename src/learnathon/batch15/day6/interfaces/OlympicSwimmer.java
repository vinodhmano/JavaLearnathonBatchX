package learnathon.batch15.day6.interfaces;

public class OlympicSwimmer extends Human implements Athlete{

	public OlympicSwimmer(String name, String nationality, int age, boolean isAlive) {
		super(name, nationality, age, isAlive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println("Swimming very fast");
		
	}

}
