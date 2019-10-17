package learnathon.batch15.day9.threads;

import java.util.Date;

public class AWithoutThread {
	private int[] tNumbers;
	
	public AWithoutThread() {
		tNumbers = new int[300];
		for(int i=0; i<tNumbers.length; i++) {
			tNumbers[i] = i;
		}
	}
	
	public int[] gettNumbers() {
		return tNumbers;
	}
	
	public static void main(String[] args) {
		long startTime = new Date().getTime();
		
		for(int i=0; i<3; i++) {
			AWithoutThread w = new AWithoutThread();
			System.out.println("Iteration " + (i+1));
			for(int n : w.gettNumbers()) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		long endTime = new Date().getTime();
		long totalTime = endTime - startTime;
		System.out.println("Total Time = " + totalTime + " ms");
		
		System.out.println("Proceeding further after " + totalTime + " ms");
	}
}
