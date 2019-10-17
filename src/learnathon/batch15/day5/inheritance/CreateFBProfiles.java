package learnathon.batch15.day5.inheritance;

import learnathon.batch15.day4.FBProfile;

public class CreateFBProfiles {
	public static void main(String[] args) {
		//calling a default constructor
		FBProfile firstUser = new FBProfile();
		firstUser.printFBUserDetails();
		System.out.println("No of Users " + FBProfile.noOfUsers);
		
		//Calling a Constructor(String, String, Char)
		FBProfile secondUser = new FBProfile("Second", "User", 'M');
		secondUser.printFBUserDetails();
		System.out.println("No of Users " + FBProfile.noOfUsers);
		
		//Calling the constuctor (String, String, Char, String, int, String, String)
		FBProfile thirdUser = new FBProfile("Third", "User", 'F', "8003432345", 25, "Hartford", "java.learnathon@gmail.com");
		thirdUser.printFBUserDetails();
		System.out.println("No of Users " + FBProfile.noOfUsers);
	}
	
	
}
