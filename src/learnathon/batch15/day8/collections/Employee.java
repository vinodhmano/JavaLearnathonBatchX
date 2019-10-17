package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.Locale;

public class Employee {  
	int id;  
	String name, dept;  
	int salary;  
	
	public Employee(int id, String name, String dept, int salary) {  
	    this.id = id;  
	    this.name = name;  
	    this.dept = dept;  
	    this.salary = salary;  
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String toString() {
		return id+ " " + name + " " + dept + " " + salary;
	}
	
	public static void printEmployee(Employee e) {
		System.out.format(Locale.UK,"%4d %15s %20s $%6d %n", e.id, e.name, e.dept, e.salary);
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if(id == e.id && e.dept == dept && e.name == name)
			return true;
		return false;
	}
	
	public int hashCode() {
		return (int)(id*salary*3);
	}
	
	public static ArrayList<Employee> buildSampleEmpList(){
		//Creating list of employees
		ArrayList<Employee> empList=new ArrayList<Employee>();  
		
		// Creating data for the employee
		Employee emp1=new Employee(101,"JOHN","ARCHITECTURE",1000);  
		Employee emp2=new Employee(102,"DAVID","MANAGEMENT",1200);  
		Employee emp3=new Employee(103,"CHRIS","DEV",1050); 
		Employee emp4=new Employee(103,"JOE","DEVOPS",1050); 
		
		//Adding employee data to the empList.
		empList.add(emp1);  
		empList.add(emp2);  
		empList.add(emp3);  
		empList.add(emp4); 
		
		return empList;
	}
	
	
}  

