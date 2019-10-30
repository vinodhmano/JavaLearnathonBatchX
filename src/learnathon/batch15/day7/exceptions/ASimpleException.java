package learnathon.batch15.day7.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calc {
	public int divider(int a, int b) throws ArithmeticException{
		if(a <0 || b <0) {
			throw new ArithmeticException("Negative numbers are not allowed");
		}
		return a/b;
	}
	
	public int adder(int a, int b) {
		return a+b;
	}
}

public class ASimpleException {
	public static void main(String[] args) {
		Calc c = new Calc();
		Scanner input = new Scanner(System.in);
		int a=0;
		int b=0;
		
		System.out.println("Program starts");
		
		try {
			System.out.print("Enter a : ");
			a = input.nextInt();
			
			System.out.print("Enter b : ");
			b = input.nextInt();
		}catch(InputMismatchException ime) {
			System.out.println("Please enter only number");
			ime.printStackTrace();
		}
	
		
		try {
			int ans = c.divider(a, b);
			System.out.println(ans);
			
		}catch(ArithmeticException ae) {
			System.out.println("You cannot divide by zero");
			ae.printStackTrace();
		}finally {
			System.out.println("Printed irrespective of exception occurance");
		}
		
		System.out.println("Program ends");
	}
}

