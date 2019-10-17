package learnathon.batch15.day3;

public class A_SimpleIf {
	public static void main(String[] args) {
		int a = 10, b =40, c=30;
		
		//simple if else
		if(a>10) {
			System.out.println("a is greater than 10");
		}
		else {
			System.out.println("a is lesser than 10");
		}
		
		//else if 
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest");
			}
			else {
				System.out.println("c is greatest");
			}
		}
		else if(b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
	}
}
