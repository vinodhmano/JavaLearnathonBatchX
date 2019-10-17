package learnathon.batch15.day4;

public class UseEmployee {
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.name = "Jack";
//		e1.designation =	 "Manager";
		
		Employee e1 = new Employee("Jack",28273,"Manager",29428);
		
		System.out.println(e1.name);
		System.out.println(e1.designation);
		
		Employee e2 = new Employee("John",298332,"Developer",43463);

//		e2.name = "John";
//		e2.designation = "Developer";
		
		System.out.println(e2.name);
		System.out.println(e2.designation);
		
		Employee manager = new Employee("Manager");
		System.out.println(manager.designation);
		
		
		Employee newEmployee = new Employee();
		System.out.println(newEmployee.name);
	}
}
