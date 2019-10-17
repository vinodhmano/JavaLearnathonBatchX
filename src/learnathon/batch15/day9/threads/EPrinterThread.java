package learnathon.batch15.day9.threads;

public class EPrinterThread implements Runnable{
	Thread t;
	String one;
	String two;
	
	public EPrinterThread(String one, String two) throws InterruptedException {
		this.one = one;
		this.two = two;
		Thread t = new Thread(this);
		t.start();
	//	t.join();
	}
	
	public void run() {
		EStringPrinter.printstrings(one, two);
	}
	
	
}
