package learnathon.batch15.day4a;

import learnathon.batch15.day4.FBProfile;

public class Google {
	
	public static void main(String[] args) {
		FBProfile fbuser = new FBProfile();
		//only public method are available for direct access
		fbuser.fname = "Kate";
		fbuser.lname = "Willson";
		fbuser.gender = 'F';
		
		
		
		fbuser.setCity("Chennai");
		System.out.println("City = " + fbuser.getCity());
				
	}
}
