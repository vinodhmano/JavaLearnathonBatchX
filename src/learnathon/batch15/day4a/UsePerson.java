package learnathon.batch15.day4a;

import learnathon.batch15.day4.Employee;

public class UsePerson {
	public static void main(String[] args) {
		
		Person p = new Person("Vinodh");
		System.out.println(p.getName());
		
		
		p.setName("Manoharan");

		p.setSSN("2345629879");

		
		System.out.println(p.getSSN());
		
	}
}
