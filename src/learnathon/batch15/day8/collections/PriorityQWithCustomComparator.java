package learnathon.batch15.day8.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQWithCustomComparator {

	public static void main(String[] args) {
		
		//order the queue based on # of length of the name
		Comparator<String> lengthComparator = new Comparator<String>() {

			@Override
			public int compare(String name1, String name2) {
				// TODO Auto-generated method stub
				return name1.length() - name2.length();
			}
			
		};
	        // Creating empty priority queue 
	        PriorityQueue<String> pQueue = 
	                          new PriorityQueue<>(lengthComparator); 
	  
	        // Adding items to the pQueue using add() 
	        pQueue.add("Ed"); 
	        pQueue.add("David");
	        pQueue.add("John");
	        pQueue.add("Joe"); 
	        pQueue.add("Stuwart");
	        pQueue.add("Williamson");
	        pQueue.add("George Williams The Third");
	        
	        
	        // Printing all elements 
	        System.out.println("The queue elements:"); 
	        Iterator<String> itr = pQueue.iterator(); 
	        while (itr.hasNext()) 
	            System.out.println(itr.next()); 
	  
	        System.out.println("----------------------------------");
	        
	        
	    } 
}
