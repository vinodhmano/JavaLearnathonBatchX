package learnathon.batch15.day10.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

public class FSerializableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filename = "emp.ANY";
		BufferedOutputStream file = new BufferedOutputStream(new FileOutputStream(filename));
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Person p1 = new Person("Person_One",25);
		
		try {
			out.writeObject(p1);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			out.close();
			file.close();
		}
		
		
		BufferedInputStream fin = new BufferedInputStream(new FileInputStream(filename));
		ObjectInputStream in = new ObjectInputStream(fin);
		
		try {
			Person p2 = (Person)in.readObject();
			System.out.println(p2.age);
			System.out.println(p2.name);
		}finally {
			fin.close();
			in.close();
		}
		
	}
}
