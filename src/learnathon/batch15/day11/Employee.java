package learnathon.batch15.day11;

import java.util.Locale;

public class Employee {  
	int id;  
	String name, dept;  
	int salary;  
	
	public Employee() {
		
	}
	
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
	
	public void printEmployee() {
		System.out.format(Locale.UK,"%4d %15s %20s $%6d %n", id, name, dept, salary);
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
}  

