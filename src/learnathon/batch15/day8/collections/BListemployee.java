package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class BListemployee { 
	
	public static void main(String[] args) {  
		//Creating list of employees
    		ArrayList<Employee> empList = new ArrayList<Employee>();  
    		
		// Creating data for the employee
    		Employee emp1=new Employee(101,"TOM","HR",1000);  
    		Employee emp2=new Employee(102,"JIM","IT",1200);  
    		Employee emp3=new Employee(103,"MARK","ADM",1050); 
    		Employee emp4=new Employee(103,"MARK","ADM",1050); 
    		
		//Adding employee data to the empList.
		empList.add(emp1);  
		empList.add(emp2);  
		empList.add(emp3);  
		empList.add(emp4); 
		
 		//Traversing through the list of employee list.
		for(Employee emp:empList){  
			System.out.println(emp.toString());  
		}  
		
		//Using a function that returns arraylist
		ArrayList<Employee> employees = Employee.buildSampleEmpList();
		for (Employee employee : employees){
			Employee.printEmployee(employee);
		}
	}
	
	
} 
