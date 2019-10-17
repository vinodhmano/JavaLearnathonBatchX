package learnathon.batch15.day4;

public class Employee {
	public String name;
	int ID;
	String designation;
	int salary;
	
	void printname() {
		System.out.println(name);
	}
	
	public Employee(String _name, int _ID, String _designation, int _salary){
		name = _name;
		ID = _ID;
		designation = _designation;
		salary = _salary;
	}
	
	public Employee(String designation) {
		this.designation = designation;
	}
	
	public Employee() {
		name = "Cognizant Employee";
		ID = 0;
		designation = "To be assigned";
		salary = 0;
	}
	
}
