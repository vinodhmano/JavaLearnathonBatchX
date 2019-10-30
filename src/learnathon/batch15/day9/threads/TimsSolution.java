package learnathon.batch15.day9.threads;

import java.util.Date;

class ValidateUserThread extends Thread{
	
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Validated User Details");
			System.out.println("Current Time = " + new Date().getTime());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ValidateCitizenShipThread extends Thread{
	
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Validated User Citizenship");
			System.out.println("Current Time = " + new Date().getTime());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	

public class TimsSolution{

	public static void main(String[] args) {
		long startTime = new Date().getTime();
		System.out.println("Main Thread start time = " + startTime);
		
		Thread t1 = new ValidateUserThread();
		Thread t2 = new ValidateCitizenShipThread();
		
		t1.start();
		t2.start();
		
		
		long endTime = new Date().getTime();
		long totalTime = endTime - startTime;
		System.out.println("Total Time = " + totalTime + " ms");

	}

}
