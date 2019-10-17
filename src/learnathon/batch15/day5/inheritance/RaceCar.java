package learnathon.batch15.day5.inheritance;

public class RaceCar extends SportsCar{
	private int rocketCapacity;

	public RaceCar() {
		super();
		this.noOfSeats = 1;
		rocketCapacity = 120;
	}
	
	public RaceCar(String model, String make, String year, int noOfCyclinders){
		//this();
		super(model,make,year,noOfCyclinders);
//		this.model = model;
//		this.make = make;
//		this.year = year;
//		this.noOfCylinders = noOfCyclinders;
//		tireWearAndTear = 0;
		noOfCars++;
	}

	public int getRocketCapacity() {
		return rocketCapacity;
	}

	public void setRocketCapacity(int rocketCapacity) {
		this.rocketCapacity = rocketCapacity;
	}
	
	//Overriding a parents class method
	public void drive() {
		System.out.println("Driving a Race car");
		this.setTireWearAndTear(this.getTireWearAndTear() + 30);
	}
	
	public String toString() {
		return "I am a Race Car";
	}
	
	public void RaceCarOnlyMethod() {
		System.out.println("I am a inside Race Car class only"); 
	}
	
		
	public void printCarDetails() {
		super.printCarDetails();
		System.out.println("Additional Race Car Details");
		System.out.printf("Rocket Capacity: %d\n",
				getRocketCapacity()
					);
		System.out.println("--------------------------------");
		}
}
