package learnathon.batch15.day9.threads;

public class EStringPrinter {
	public static synchronized void printstrings(String a, String b) {
			System.out.print(a + " ");
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(b);
		
		
	}
}
