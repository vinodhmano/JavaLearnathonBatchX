package learnathon.batch15.day5.objectsasfields;

public class Street {
	private String streetName;
	private int streetPopulation;
	
	//Constructor
	public Street(String streetName, int streetPopulation) {
		this.streetName = streetName;
		this.streetPopulation = streetPopulation;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getStreetPopulation() {
		return streetPopulation;
	}
	public void setStreetPopulation(int streetPopulation) {
		this.streetPopulation = streetPopulation;
	}
	
}
