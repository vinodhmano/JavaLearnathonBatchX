package learnathon.batch15.day9.threads;

import java.util.ArrayList;

/*
 * To Demonstrate the join() importance
 * 
 */
class Employee{
	String name;
	int salary;
	float taxPercentage;
	int taxableAmount;
	
	public Employee(String name, int salary) {
		this.taxPercentage = 0;
		this.name = name;
		this.salary = salary;
	}
	
//	public int calculateTax() {
//		if(salary >= 500000) this.taxPercentage = .3f;
//		if(salary >=300000 && salary < 500000) this.taxPercentage = .2f;
//		if(salary < 300000) this.taxPercentage = .1f;
//		
//		return (int) (this.salary * this.taxPercentage);
//	}
}

class TaxCalculator implements Runnable{
	Employee e;
	
	public TaxCalculator(Employee e) {
		this.e = e;
	}
	
	public void calculateTax() {
		
	}

	@Override
	public void run() {
		
		//to simulate the time taken to do some calculation before calculating tax
		//like reading the data from database
		//doing some data cleaning etc.,
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if(e.salary >= 500000) e.taxPercentage = .3f;
		if(e.salary >=300000 && e.salary < 500000) e.taxPercentage = .2f;
		if(e.salary < 300000) e.taxPercentage = .1f;
		
		e.taxableAmount = (int) (e.salary * e.taxPercentage);
		System.out.printf("Name : %s   Salary : %d   Tax : %d\n",e.name,e.salary,e.taxableAmount);
		
	}
}

public class DTaxCalcDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//create an array of 10 employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for(int i = 0; i<10 ; i++) {
			employees.add(new Employee(new String("Employee " + (i+1)),(i * 100000)));
		}
		
		//calculate the tax of the employees in separate threads
		for(Employee e : employees) {
			Thread s = new Thread(new TaxCalculator(e));
			s.start();
			s.join();
		}
		
		//Read the calculated tax
		for(Employee e : employees) {
			System.out.println("Tax amount for " + e.name + " : " + e.taxableAmount);
		}
		
		System.out.println("Program Exit");

	}
	
}
