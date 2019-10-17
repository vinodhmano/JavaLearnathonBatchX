package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	  HashSet<String> set = new HashSet<String>();  
	  ArrayList<String> list = new ArrayList<String>();
	  
	  set.add("Ravi");  
	  list.add("Ravi");
	  
	  set.add("Vijay");
	  list.add("Vijay");
	  
	  set.add("Ravi");  //Duplicate
	  list.add("Ravi");
	  
	  set.add("Ajay"); 
	  list.add("Ajay");
	  
	  //Traversing elements in list
	  System.out.println("Traversing elements in list");
	  for(String name:list) {
		  System.out.println(name);
	  }
	  
	  
	  //Traversing elements in set 
	  System.out.println("Traversing elements in set");
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  
	  
	HashSet<String> temp = new HashSet<String>(list);
	list = new ArrayList<String>(temp);
	
	  
	//list = new ArrayList<String>(new HashSet<String>(list));
	
	
	  //After duplicates removed 
	 System.out.println("After duplicates removed");
	for(String name:list) {
		  System.out.println(name);
	  }
	  
	 }  
}
