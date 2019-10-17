package learnathon.batch15.day5.inheritance;

public class VintageCar extends Car{
	int noOfExteriorSpareTire;
	
	public VintageCar() {
		this.noOfSeats = 5;
		this.noOfExteriorSpareTire = 2;
		noOfCars++;
	}
	
//Overriding a parents class method
	public void drive() {
		System.out.println("Driving a Vintage car");
		this.setTireWearAndTear(this.getTireWearAndTear() + 3);
	}

	
	public int getNoOfExteriorSpareTire() {
		return noOfExteriorSpareTire;
	}
	
	public String toString() {
		return "I am a Vintage Car";
	}
	
	
	public void printCarDetails() {
		super.printCarDetails();
		System.out.println("Additional Vintage Car Details");
		System.out.printf("Number of exeterior spare tires : %d\n",
				getNoOfExteriorSpareTire());
		System.out.println("--------------------------------");
	}

	public void setNoOfExteriorSpareTire(int noOfExteriorSpareTire) {
		this.noOfExteriorSpareTire = noOfExteriorSpareTire;
	}
	
	
}
