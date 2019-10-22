package learnathon.batch15.day7.exceptions;

class Calc {
	public int divider(int a, int b){
		
		return a/b;
	}
	
	public int adder(int a, int b) {
		return a+b;
	}
}

public class ASimpleException {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println("Program starts");
		
		System.out.println(c.divider(8, -1));
		
		System.out.println("Program ends");
	}
}

