package learnathon.batch15.day4;

//public = Access to all classes
//private = Access to methods in the same class
//protected = Access to classes in the same package. Diff package, as long as the class is extended
//default = Access to classes in the same package. Not to a different package

public class FBProfile {
	//public fields can be seen by everyone
	public String fname;
	public String lname;
	public char gender;
	public static int noOfUsers;
	
	//private fields will be visible only within this class
	private String phoneNumber;
	private int age;
	
	//protected fields will be visible only if extended
	protected String city;
	
	//default fields
	String emailID;
	
	//Constructors
	public FBProfile() {
		noOfUsers++;
	}
	
	public FBProfile(String fname, String lname, char gender) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		noOfUsers++;
	}
	
	public FBProfile(String fname, String lname, char gender, String phoneNumber, int age, String city, String emailID) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.city = city;
		this.emailID = emailID;
		noOfUsers++;
	}
	
	//Methods
	
	//Setters

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	//Getters
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public char getGender() {
		return gender;
	}

	//We can change how the data can be accessed
	public String getPhoneNumber() {
		if(phoneNumber != null) {
			return "XXX-XXX-" + phoneNumber.substring(6);
		}
		else
			return null;
	}

	//Age is very private
	private int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}


	public String getEmailID() {
		return emailID;
	}
	
	
	//user defined methods
	public String getName(){
		return (getFname() + " " + getLname());
	}
	
	public  static void printSomething() {
		System.out.println("Printing something");
	}
	
	public void printFBUserDetails() {
		System.out.printf("Name = %s\n", getName());
		System.out.printf("Gender = %s\n", gender);
		System.out.printf("Phone Number = %s\n", getPhoneNumber());
		System.out.printf("City = %s\n", city);
		System.out.printf("E-Mail ID = %s\n", emailID);
	}
	
	
//	public int hashCode() {
//		return age * (int)gender * Integer.parseInt(phoneNumber.substring(5));
//	}
//	
//	
//	public boolean equals(Object obj) {
//		if(this.hashCode() == ((FBProfile)obj).hashCode()) {
//			return true;
//		}
//		return false;
//	}
//	
//	public boolean equals(Object obj) {
//		if(this.getAge() == ((FBProfile)obj).getAge()) {
//			return true;
//		}
//		return false;
//	}
	
}
