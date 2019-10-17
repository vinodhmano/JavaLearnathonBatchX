package learnathon.batch15.day5.inheritance;

public class Car {
	//private short carID;
	
	protected int noOfSeats;
	private String model;
	private String make;
	private String year;
	private int tireWearAndTear;
	private int noOfCylinders;
	public static int noOfCars;
	
	
	//Constructor
	//this will be called Car myCar = new Car();
	public Car(){
		tireWearAndTear = 0;
		noOfCars++;
	}
	
	//Constructor with parameter
	public Car(String model, String make, String year, int noOfCyclinders){
		//this();
		this.model = model;
		this.make = make;
		this.year = year;
		this.noOfCylinders = noOfCyclinders;
		tireWearAndTear = 0;
		noOfCars++;
	}
	
	public Car(String model) {
		this.model = model;
	}

	//public methods
	public void drive(){
		System.out.println("Driving a regular car");
		this.setTireWearAndTear(this.getTireWearAndTear() + 1);
	}
	
	public void printCarDetails() {
		System.out.println("--------------------------------");
		System.out.println("Car Details");
		System.out.println("--------------------------------");
		System.out.printf("Make: %s\nModel: %s\nYear: %s\nNo of Cylinders: %d\n",
						getMake(),
						getModel(),
						getYear(),
						getNoOfCylinders());
		System.out.println("--------------------------------");
	}
	
	public String toString() {
		return "I am a Regular Car";
	}
	
	public void brakingSystem() {
		System.out.println("I am a inside Car class only"); 
	}
	
	//Getters and Setters
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTireWearAndTear() {
		return tireWearAndTear;
	}

	public void setTireWearAndTear(int tireWearAndTear) {
		this.tireWearAndTear = tireWearAndTear;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}
	
	
	public static int getNoOfCars(){
		return noOfCars;
	}
	
	
}