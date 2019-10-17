package learnathon.batch15.day3;

import java.util.Scanner;

public class D_NumOfDaysInMonth {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the month number: ");
		int month = s.nextInt();
		int nDay = 0;
		s.close();
		
//		switch(month) {
//		case 1:
//			nDay = 31;
//			break;
//			
//		case 2:
//			nDay = 28;
//			break;
//			
//		case 3:
//			nDay = 31;
//			break;
//			
//		case 4:
//			nDay = 30;
//			break;
//			
//		case 5:
//			nDay = 31;
//			break;
//			
//		default:
//			System.out.println("Invalid month");
//				
//		}
		
		
		
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			nDay = 31;
			break;
		
		case 4: case 6: case 9: case 11:
			nDay = 30;
			break;
		
		case 2:
			nDay = 28;
			break;
					
		default:
				System.out.println("Invalid month");
				break;
		}
		
		System.out.println("Num of Days: " + nDay);
	}

}
