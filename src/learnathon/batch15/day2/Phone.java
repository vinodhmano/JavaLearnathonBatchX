package learnathon.batch15.day2;

public class Phone {
	//members or fields
	String name;
	int storageCapacity;

	//methods
	void takePhoto() {
		storageCapacity -= 8;
		//also can be written as
		//storageCapacity = storageCapacity - 8;
	}
	
	void storageReport(int capacity) {
		float availableCapacity = (float) storageCapacity/1024;
		System.out.printf("%d MB used\t %f GB available\n", 
				(capacity-storageCapacity),availableCapacity);
	}
	
	public static void main(String[] args) {
		Phone pixel3 = new Phone();
		int capacity = 64 * 1024;
		pixel3.storageCapacity = capacity;
		
		System.out.println("New Phone");
		pixel3.storageReport(pixel3.storageCapacity);
		
		for(int i=0; i<50; i++) {
			pixel3.takePhoto();
		}
		
		System.out.println("After taking 50 photos");
		pixel3.storageReport(capacity);
	}
	
}
