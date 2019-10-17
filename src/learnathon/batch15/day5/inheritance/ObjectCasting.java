package learnathon.batch15.day5.inheritance;

public class ObjectCasting {
	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		
		SportsCar sportscar = new SportsCar();
		System.out.println(sportscar);
		
		RaceCar racecar = new RaceCar();
		System.out.println(racecar);
		
		//implicit casting
//		car = sportscar;
//		System.out.println(car);
		
		if(car instanceof SportsCar) {
			sportscar = (SportsCar) car;
			System.out.println(sportscar);
		}
		
		Car anotherCar = new RaceCar();
		racecar = (RaceCar) anotherCar;
		System.out.println(racecar);
		

		
		
		
	}

}
