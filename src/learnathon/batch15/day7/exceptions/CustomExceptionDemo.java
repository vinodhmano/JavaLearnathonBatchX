package learnathon.batch15.day7.exceptions;

class FlatTireException extends Exception{
	
	public FlatTireException(String message) {
		super(message);
	}
}

class Car{
	boolean flatTire = false;
	
	public void drive() throws FlatTireException {
		if(flatTire) throw new FlatTireException("Car not allowed to drive with flat tires");
		System.out.println("Driving car");
	}
	
	public void simulateFlatTire() {
		flatTire = true;
		System.out.println("Tire is flat now");
	}
}
public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.drive();
			car.simulateFlatTire();
			car.drive();
		} catch (FlatTireException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} 

}
