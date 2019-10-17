package learnathon.batch15.day5.objectsasfields;

public class State {
	private String stateName;
	private City[] cities;
	private int stPop;
	private Officials officials;
	
	class Officials{
		private String governor;
		private String mayor;
		
		public Officials(String governor, String mayor) {
			this.governor = governor;
			this.mayor = mayor;
		}
		public String getGovernor() {
			return governor;
		}
		public void setGovernor(String governor) {
			this.governor = governor;
		}
		public String getMayor() {
			return mayor;
		}
		public void setMayor(String mayor) {
			this.mayor = mayor;
		}
		
	}//end of Officials class
	
	public void setOfficials(String governor, String mayor) {
		officials = new Officials(governor, mayor);
	}
	
	public Officials getOfficials() {
		return officials;
	}
	
	//Constructor
	public State(String name, City[] cities) {
		this.stateName = name;
		this.cities = cities;
		for(City city : cities) {
			this.setStPop(this.getStPop() + city.getCityPop());
		}
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
		for(City city : cities) {
			this.setStPop(this.getStPop() + city.getCityPop());
		}
	}
	
	public int getStPop() {
		return stPop;
	}

	public void setStPop(int stPop) {
		this.stPop = stPop;
	}
	

	public String toString() {
		StringBuilder stateDetails = new StringBuilder();
		stateDetails.append("Details of " + getStateName() + "\n");
		stateDetails.append("********************************************************\n");
		stateDetails.append("Total population is " + getStPop() + "\n");
		stateDetails.append("There are totally " + getCities().length + " cities in " + getStateName() + "\n");
		stateDetails.append("They are as follows\n\n");
		for(City city : getCities()) {
			stateDetails.append(city.toString());
		}
		return stateDetails.toString();
	}


}
