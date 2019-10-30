package learnathon.batch15.day9.threads;

public class CRunnableDemo implements Runnable {
	private int[] tNumbers;
	
	public CRunnableDemo() {
		tNumbers = new int[20];
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
			System.out.println("From Thread " + Thread.currentThread().getName() + " :" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		CRunnableDemo t1 = new CRunnableDemo(); //runnable class
		Thread first = new Thread(t1,"First");

		CRunnableDemo t2 = new CRunnableDemo();
		Thread second = new Thread(t2,"Second");

		CRunnableDemo t3 = new CRunnableDemo();
		Thread third = new Thread(t3,"Third");
		
		
		
		first.start();
		second.start();
		third.start();
		
		new Thread(new CRunnableDemo(), "fourth").start();

		//from main thread
		for(int i=0; i<20; i++) {
			System.out.println("From Thread " + Thread.currentThread().getName() + " :" + i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
