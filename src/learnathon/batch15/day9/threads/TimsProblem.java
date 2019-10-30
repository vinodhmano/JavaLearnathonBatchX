package learnathon.batch15.day9.threads;

import java.util.Date;

public class TimsProblem {
	
	public static void validateUserDetails() {
		try {
			Thread.sleep(3000);
			System.out.println("Validated User Details");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void validateUserCitizenship() {
		try {
			Thread.sleep(4000);
			System.out.println("Validated User Citizenship");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		long startTime = new Date().getTime();
		System.out.println("Main Thread start time = " + startTime);
		validateUserDetails();
		validateUserCitizenship();
		long endTime = new Date().getTime();
		long totalTime = endTime - startTime;
		System.out.println("Main Thread end time = " + endTime);
		System.out.println("Total Time = " + totalTime + " ms");
		
	}

}
