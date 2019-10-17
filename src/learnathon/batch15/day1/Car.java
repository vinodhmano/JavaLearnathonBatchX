package learnathon.batch15.day1;

public class Car {
	//This class is a real world implementation of Car
	
	//properties OR "fields"
	String color;
	int noOfWheels = 4;
	boolean manualTransmision;
	String make;
	String model;
	
	//behavior OR "method"
	void drive() {
		System.out.println("Car is driving");
	}
	
	void applyBrake() {
		System.out.println("Car stopped");
	}
	
	void reverseGear() {
		System.out.println("Car is in reverse gear mode");
	}
	
	public static void main(String[] args) {
		
		//Creating new cars
		Car toyota = new Car();
		toyota.color = "Red";
		toyota.manualTransmision = true;
		toyota.noOfWheels = 10;
		
		System.out.println(toyota.color);
		System.out.println(toyota.manualTransmision);
		System.out.println(toyota.noOfWheels);
		System.out.println(toyota.make);
		
		toyota.drive();
		
	}
	
}
