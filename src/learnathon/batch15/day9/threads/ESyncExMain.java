package learnathon.batch15.day9.threads;

public class ESyncExMain {
	public static void main(String[] args) throws InterruptedException{
		//synchronized method
//		EPrinterThread r1 = new EPrinterThread("Hello","Guys");
//		EPrinterThread r2 = new EPrinterThread("Whats","Up");
//		EPrinterThread r3 = new EPrinterThread("How are you","doing");

//		Synchronized object
		EStringPrinter e = new EStringPrinter();
		
		EPrinterThread r1 = new EPrinterThread("Hello","Guys",e);
		EPrinterThread r2 = new EPrinterThread("Whats","Up",e);
		EPrinterThread r3 = new EPrinterThread("How are you","doing",e);

		
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
	
	}

}
