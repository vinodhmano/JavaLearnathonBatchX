package learnathon.batch15.day3;

public class E_NestedIf {
	public static void main(String[] args) {
		int i = 21;
		
		//check if i > 10
		//check if i < 20
		
		if(i > 10) {
			//Executed only if the condition is evaluated True
			//If the condition is evaluated false, block of code is skipped
			if(i < 20) {
				//Executed only if i > 10 and i > 20
				System.out.println("i is greater than 10 and less than 20");
			}
			else {
				//Executed if i > 10, but i < 20
				System.out.println("i is greater than 10 but greater than 20");
			}	
		}
		else {
			//Execute if the condition in if statement is False
			System.out.println("i is less than 10");
		}
		
		System.out.println("Out of if statement");
	}
}
