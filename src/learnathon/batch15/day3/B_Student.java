package learnathon.batch15.day3;

public class B_Student {
	String name;
	String gender;
	String country;   //Voting age in India = 18 ; Voting age in US = 21
	int age;
	int mark1;
	int mark2;
	
	
	
	void printStudentDetails(){
		System.out.println(name);
		System.out.println(country);
		System.out.println(age);
	}
	
	int totalMarks() {
		return (mark1 + mark2);
	}
	
	
	void isAllowedToVote(){
		if(country == "India" && age >= 18){
			System.out.println("Voting is allowed in India");
		}
		else if(country == "US" && age >= 21){
			System.out.println("Voting is allowed in US");
		}
		else{
			System.out.println("Voting is not allowed");
		}
	}
}

