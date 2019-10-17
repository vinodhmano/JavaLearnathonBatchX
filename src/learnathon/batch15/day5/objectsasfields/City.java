package learnathon.batch15.day5.objectsasfields;

public class City {
	private String cityName;
	private Street[] streetsInCity;
	private int cityPop;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Street[] getStreetsInCity() {
		return streetsInCity;
	}
	
	public void setStreetsInCity(Street[] streetsInCity) {
		this.streetsInCity = streetsInCity;
		for(Street st : streetsInCity) {
			this.setCityPop(this.getCityPop() + st.getStreetPopulation());
		}
	}
	
	public int getCityPop() {
		return cityPop;
	}
	public void setCityPop(int cityPop) {
		this.cityPop = cityPop;
	}
	
	public String toString(){
		StringBuilder cityDetails = new StringBuilder();
		cityDetails.append("Details of " + getCityName() + "\n");
		cityDetails.append("---------------------------------\n");
		cityDetails.append("Total population is " + getCityPop() + "\n");
		cityDetails.append("There are totally " + getStreetsInCity().length + " streets in " + getCityName() + "\n");
		cityDetails.append("They are as follows\n\n");
		for(Street st : getStreetsInCity()) {
			cityDetails.append(st.getStreetName() + "\n");
		}
		cityDetails.append("\n");
		return cityDetails.toString();
	}

}
