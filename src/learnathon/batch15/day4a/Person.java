package learnathon.batch15.day4a;

public class Person {
	private String name;
	private int age;
	private String address;
	private float salary;
	private String ssn;
	
//	public void setSSN(String ssn) {
//		this.ssn = ssn;
//	}
	
	public void setSSN(String ssn) {
		if(ssn.length() == 10) {
			this.ssn = ssn;
		}
		else {
			System.out.println("SSN cannot be set");
		}
	}
	
//	public String getSSN() {
//		return ssn;
//	}
	
	public String getSSN() {
		
		return "XXX-XXX-" + ssn.substring(6);
	}
	
	
	public Person(String name) {
		this.name = name;
	}
	
	//Getter methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	

}
