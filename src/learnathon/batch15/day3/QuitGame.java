package learnathon.batch15.day3;

import java.util.Scanner;

public class QuitGame {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int response = 0;
		
		System.out.println("Starting the game");
		//start_game();
		
		
		do{
			System.out.println("Keep Playing");
			//quit_game();
			System.out.println("Do you want to quit?");
			response = s.nextInt();
		}while(response==0);
		s.close();
	}

}
