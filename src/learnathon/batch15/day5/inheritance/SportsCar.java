package learnathon.batch15.day5.inheritance;

public class SportsCar extends Car {
	private int maxHorsePower;
	private int noOfManualGears;
	
	public SportsCar() {
		super(); //new Car()
		//super("BMW");
		this.noOfSeats = 2;
		maxHorsePower = 500;
		noOfManualGears = 7;
	}
	
	public SportsCar(String model, String make, String year, int noOfCyclinders){
		//this();
		super(model,make,year,noOfCyclinders);
//		this.model = model;
//		this.make = make;
//		this.year = year;
//		this.noOfCylinders = noOfCyclinders;
//		tireWearAndTear = 0;
		this.noOfSeats = 2;
		maxHorsePower = 500;
		noOfManualGears = 7;
		noOfCars++;
	}
	
	
	
	public int getMaxHorsePower() {
		return maxHorsePower;
	}


	public void setMaxHorsePower(int maxHorsePower) {
		this.maxHorsePower = maxHorsePower;
	}


	public int getNoOfManualGears() {
		return noOfManualGears;
	}


	public void setNoOfManualGears(int noOfManualGears) {
		this.noOfManualGears = noOfManualGears;
	}


	//Overriding a parents class method
	public void drive() {
		//super.drive(miles);
		System.out.println("Driving a Sports car");
		this.setTireWearAndTear(this.getTireWearAndTear() + 5);
	}
	
	public String toString() {
		return "I am a Sports Car";
	}
	
	public void SportsCarOnlyMethod() {
		System.out.println("I am a inside Sports Car class only"); 
	}

	
	public void printCarDetails() {
		super.printCarDetails();
		System.out.println("Additional Sports Car Details");
		System.out.printf("HorsePower: %d\nNo of Manual Gears: %d\n",
				getMaxHorsePower(),
				getNoOfManualGears());
		System.out.println("--------------------------------");
	}
}
