package learnathon.batch15.day4a;

import learnathon.batch15.day4.FBProfile;

//InstagramUser is a subclass of FBProfile
public class InstagramUser extends FBProfile{
	
	public static void main(String[] args) {
		InstagramUser ford = new InstagramUser();
		
		//now the subclasses can access public and protected fields & methods
		//not private and default fields & methods
		ford.fname = "Ford";
		
		
		//protected fields & methods
		ford.city = "Sydney";
		
		
		
		System.out.println(ford.city);
		
	}
}
