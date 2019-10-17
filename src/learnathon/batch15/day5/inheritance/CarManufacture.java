package learnathon.batch15.day5.inheritance;

import java.util.ArrayList;

import learnathon.batch15.day5.inheritance.RaceCar;
import learnathon.batch15.day5.inheritance.SportsCar;

public class CarManufacture {
	
	public static Car getFirstMathcingCar(Car[] cars, String make) {
		//Returns the first Car that matches the "make" in the array of cars
		for(int nthCar=0; nthCar<cars.length; nthCar++) {
			if(cars[nthCar].getMake().equalsIgnoreCase(make))
				return cars[nthCar]; //Car object
		}
		return null;
	}
	
	public static ArrayList<Car> getAllMatchingCars(Car[] cars, String make) {
		ArrayList<Car> matchingCars = new ArrayList<Car>();
		for(int nthCar=0; nthCar<cars.length; nthCar++) {
			if(cars[nthCar].getMake().equalsIgnoreCase(make))
				matchingCars.add(cars[nthCar]);
		}
		return matchingCars;
	}
	
	public static void main(String[] args){
		
		Car aCar = new Car("Altima","Nissan","2018",4);
		aCar.drive();
		aCar.printCarDetails();
		
		SportsCar aSportsCar = new SportsCar("BMW","M2","2019",8);
//		aSportsCar.setMake("BMW");
//		aSportsCar.setModel("M2");
//		aSportsCar.setYear("2019");
//		aSportsCar.setNoOfCylinders(8);
		
		aSportsCar.drive();
		aSportsCar.printCarDetails();
		
		
		
		RaceCar aRaceCar = new RaceCar();
		aRaceCar.setMake("McLauren");
		aRaceCar.setModel("Fang");
		aRaceCar.setYear("2019");
		aRaceCar.setNoOfCylinders(12);
		
		
		aRaceCar.drive();
		aRaceCar.printCarDetails();
	}
}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Before creating cars - " + Car.getNoOfCars());
//		
//		Car honda = new Car();
//		Car nissan = new Car("Altima","Nissan","2019","Gasoline",6);
//		Car jeep = new Car(4,40.5f,6000,0,"Caroke","Jeep","2018","Diesel",4);
//		Car bmw = new Car(5); 
//		
//		
//		Car[] bulkOrder = new Car[40];
//		
//		for(int i=0; i<bulkOrder.length; i++){
//			bulkOrder[i] = new Car();
//		}
//		
		
		
//		bmw.setNoOfWheels(4);
//		bmw.setOdometer(500);
//		bmw.setOdometer(-100);
//		System.out.println("Odometer - " + bmw.getOdometer());
//		
//		
//		System.out.println("No of wheels - " + bmw.getNoOfWheels());
//		
//		System.out.println("After creating cars - " + Car.noOfCars);
//
//
//		jeep.drive(2000);
//		jeep.drive(3000,"local");
//		jeep.drive(10000,"highway");
//		jeep.drive(500,"city");
//		
//		String oilChange = jeep.isTimeForOilChange() ? "Yes" : "No";
//		System.out.println("Time for Oil Change? : " + oilChange);
//		

