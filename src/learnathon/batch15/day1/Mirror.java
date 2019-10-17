package learnathon.batch15.day1;

import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		
		//Get input from the user
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		
		//Print the input in console
		System.out.println(userInput);
		
		System.out.println(keyboard.nextLine());
		
		keyboard.close();
		
	}
}
