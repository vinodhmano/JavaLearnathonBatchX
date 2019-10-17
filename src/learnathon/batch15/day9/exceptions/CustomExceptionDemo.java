package learnathon.batch15.day9.exceptions;

class FlatTireException extends Exception{
	private final String message = "Tire is flat. Driving is stopped";
	
	public FlatTireException() {
		System.out.println(message);
	}
}

class Car{
	boolean flatTire = false;
	
	public void drive() throws FlatTireException {
		if(flatTire) throw new FlatTireException();
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
