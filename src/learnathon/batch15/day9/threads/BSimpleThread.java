package learnathon.batch15.day9.threads;

import java.util.Date;

public class BSimpleThread extends Thread{
	private int[] tNumbers;
	
	public BSimpleThread() {
		tNumbers = new int[300];
		for(int i=0; i<tNumbers.length; i++) {
			tNumbers[i] = i;
		}
	}

	public int[] gettNumbers() {
		return tNumbers;
	}

	public void settNumbers(int[] tNumbers) {
		this.tNumbers = tNumbers;
	}
	
	public void run() {
		for(int i:tNumbers) {
			System.out.println("From Thread " + this.getName() + " :" + i);
		}
	}
	
	
	public static void main(String[] args){
		
		long startTime = new Date().getTime();
		
		BSimpleThread t1 = new BSimpleThread();
		t1.setName("alpha");
		t1.setPriority(MAX_PRIORITY);
		
		BSimpleThread t2 = new BSimpleThread();
		t2.setName("beta");
		
		BSimpleThread t3 = new BSimpleThread();
		t3.setName("gamma");

		
		t1.start();
		t2.start();
		t3.start();
		
		long endTime = new Date().getTime();
		
		long totalTime = endTime - startTime;
		System.out.println("Total Time = " + totalTime + " ms");
		
		System.out.println("Proceeding further after " + totalTime + " ms");
		
		
	}
}
