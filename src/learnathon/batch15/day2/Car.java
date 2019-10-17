package learnathon.batch15.day2;

public class Car {
	//This class is a real world implementation of Car
	
	//properties OR "fields"
	String color;
	int noOfWheels = 4;
	boolean manualTransmision;
	String make;
	String model;
	
	//Newly added fields
	byte gear;
	int miles = 0;
	int totalGas = 0;
	byte tankCapacity = 0;
	byte gasLevel = 0;
	float mileage;
	
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
	
	//newly added methods
	public void calculateMileage() {
		int total_miles = miles; //local variable
		int total_gas = totalGas;
		mileage = (float) total_miles/total_gas;
	}
	
	public void printMileage() {
		//local variable lives only within that method that declared it
		//the following line won't compile
		//System.out.println("Total miles " + total_miles);
		
		//Instance variables live only within the class
		//That means, it is available for all methods in that class
		//hence mileage can be access by all methods inside Car
		System.out.println("Mileage is " + mileage);
	}
	
	public static void main(String[] args) {
		
		//Creating new cars
		Car toyota = new Car();
		toyota.color = "Red";
		toyota.manualTransmision = true;
		toyota.noOfWheels = 4;
		toyota.miles = 85000;
		toyota.totalGas = 4566;
		
		/*
		System.out.println(toyota.color);
		System.out.println(toyota.manualTransmision);
		System.out.println(toyota.noOfWheels);
		System.out.println(toyota.make);
		
		toyota.drive();
		*/
		
		toyota.calculateMileage();
		toyota.printMileage();
		
	}
	
}
