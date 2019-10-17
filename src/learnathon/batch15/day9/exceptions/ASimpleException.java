package learnathon.batch15.day9.exceptions;

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
		int[] a = {0, 2, 4, 6, 8, 10};
		int[]  b = {10, 8, 6, 4, 2, 0};
		
		System.out.println("Program starts");
		
		//this will throw ArithmeticException
		
		try {
			for(int i=0; i<a.length; i++) {
				System.out.printf("%d / %d = %d\n", a[i], b[i],  c.divider(a[i], b[i]));
			}
		}catch(ArithmeticException ae) {
			System.out.println("Division by zero not allowed");
		}
		
		try {
			//this will throw ArrayOutOfBoundException
			for(int i=0; i<=a.length; i++) {
				System.out.printf("%d + %d = %d\n", a[i], b[i],  c.adder(a[i], b[i]));
			}
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Element not found");
		}
		
		System.out.println("Program ends");
	}
}

