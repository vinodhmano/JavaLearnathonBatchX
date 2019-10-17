package learnathon.batch15.day11;


import java.io.IOException;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) throws IOException {
		
		int response = ' ';
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcome to DB Console");
		
		do {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("What would you like to do");
			System.out.println("Enter a response from the following");
			System.out.println("1 : Create Database \t 2 : Create Table \t 3 : Save Employee \t 4 : Search Employee \t 5 : All Employees \t 0 : Quit");
			response = reader.nextInt();
			
			switch(response){
			case 1:
				EmployeeDBO.createNewDatabase("EMP");
				break;
				
			case 2:
				EmployeeDBO.createTable();
				break;
				
			case 3:
				Employee e = new Employee();
				System.out.print("Enter employee ID : ");
				e.setId(Integer.parseInt(reader.next()));
				System.out.print("\nEnter employee name : ");
				e.setName(reader.next());
				System.out.print("\nEnter employee department : ");
				e.setDept(reader.next());
				System.out.print("\nEnter employee salary : ");
				e.setSalary(Integer.parseInt(reader.next()));
				
				EmployeeDBO.saveEmploye(e);
				break;
				
			case 4: 
				System.out.print("Enter employee ID : ");
				EmployeeDBO.getEmployeeById(reader.nextInt());
				break;
				
			case 5:
				EmployeeDBO.getAllEmployees();
				break;
			}
		}while(response != 0);
		
		reader.close();
	}

	
}
