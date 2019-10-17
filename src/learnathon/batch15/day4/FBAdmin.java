package learnathon.batch15.day4;

public class FBAdmin {
	public static void main(String[] args) {
		//Create some FBProfiles
		 
		FBProfile jack = new FBProfile();

		
		//Since FBAdmin and FBProfile classes are in same package,
		//FBAdmin have access to public, protected and default 
		//members & methods of FBProfile
		
		//public members are directly accessed without using the setter methods
		jack.fname = "Jack";
		jack.lname = "Sheapord";
		jack.gender = 'M';
		
		//default members are directly accessed without using the setter methods
		jack.emailID = "jack.sheapord@island.in";
		
		//protected members are directly accessed without using the setter methods
		jack.city = "Sydney";

		//private members cannot be accessed
		//following lines of code will not compile
		//jack.phoneNumber = "8888788823";
		//jack.age = 35;
		
		//Above demonstrations are true for methods too
		//private methods cannot be accessed
		//following lines of code will not compile
		//int age = jack.getAge();
		
		//Can access the private fields only through getter & setter methods
		jack.setPhoneNumber("8888788823");
		System.out.println("Phone number is " + jack.getPhoneNumber());
		
		
		FBProfile claire = new FBProfile();

		claire.fname = "Claire";
		
		FBProfile john = new FBProfile();

		john.fname = "John";
		
		System.out.println(claire.fname);
		System.out.println(john.fname);
		

		

		//Access static methods directly from the class
		//Objects need not be created
		//System.out.println("No of FB users = " + FBProfile.noOfUsers);
		
		FBProfile.printSomething();
		
	}
}
