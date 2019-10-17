package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.ListIterator;

public class SimpleArrayList {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Vinodh");
		students.add("Raj");
		students.add("Manoharan");
		students.add("Kumar");
		students.add("Raja");
		students.add("Selva");
		
		
		System.out.println(students.size());
		System.out.println(students.get(3));
		
		System.out.println(students.contains("Manoharan"));
		
		students.remove("Selv");
		System.out.println(students.size());
		
		

		System.out.println(students);
		
		
		
		//Iterating using for loop
		System.out.println("Printing using for loop");
		for(int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i).toLowerCase());
		}
		
		
		
		//Iterating using Iterator interface
		System.out.println("Printing using Iterator interface");
		
		Iterator<String> listiterator = students.iterator();
		while(listiterator.hasNext()) {
			System.out.println("Hello " + listiterator.next());
		}
		
		
		//Iterating using for each loop
		System.out.println("Printing using for-each loop");
		
		//for(int i = 0; i<students.size(); i++) {
		for(String student:students) {  //for each String student in students  //for each item in collection
			System.out.println(student.toUpperCase());
		}
		
		
		/*
		//Iterating using listIterator interface
		System.out.println("Printing using listIterator interface");
		ListIterator<String> reverseprinter = students.listIterator(students.size());
		while(reverseprinter.hasPrevious()) {
			System.out.println(reverseprinter.previous());
		}
		
		
		
		//Iterating using forEach() method
		System.out.println("Printing using forEach() method. Using lambda expression");
		
		
		
		/*
		accessspecifier returntype functionname(input){
			//statements
		}
		
		
		students.forEach(student->{
			System.out.println(student);
		});
		
		
		//Iterating using forEachRemaining() method
		System.out.println("Printing using forEachRemaining() method. Using lambda expression");
		Iterator<String> itr = students.iterator();
		itr.forEachRemaining(student->{
			System.out.println(student);
		});
		
		
		*/
	}
	
	
}
