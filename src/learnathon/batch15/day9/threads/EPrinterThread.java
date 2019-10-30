package learnathon.batch15.day9.threads;

public class EPrinterThread implements Runnable{

	String one;
	String two;
	EStringPrinter e;
	
	//Synchronized method
//	public EPrinterThread(String one, String two) throws InterruptedException {
//		this.one = one;
//		this.two = two;
//	}
	
//	Synchronized Object
	public EPrinterThread(String one, String two, EStringPrinter e) throws InterruptedException {
		this.one = one;
		this.two = two;
		this.e = e;
	}
	
	public void run() {
		
		//synchronized method
//		EStringPrinter.printstrings(one, two);

//		Synchronized Object
		synchronized(e) {
			e.printstrings(one, two);
		}
		
	}
	
	
}
