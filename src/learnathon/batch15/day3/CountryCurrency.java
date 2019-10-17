package learnathon.batch15.day3;

import java.util.Scanner;

public class CountryCurrency {
	
	public static void main(String[] args){
		//get the input from keyboard
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the country name: ");
		String country = s.nextLine();
		
		String currency = "Unknown";
		s.close();
		
		switch(country){
		case "India":  //if(country == "India")
			currency = "INR";
			break;
			
		case "US":
			currency = "USD";
			break;
			
		case "UK":
			currency = "EURO";
			break;
			
		default:
			System.out.println("Just paper");
			break;
		}
		System.out.println("The currency for " + country + " is " + currency);	
	}
}
