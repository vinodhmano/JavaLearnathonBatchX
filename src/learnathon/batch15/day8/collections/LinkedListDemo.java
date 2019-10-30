package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args) {
		
		//Another Example
		ArrayList<String> l_names = new ArrayList<String>();
		LinkedList<String> ll_names =new LinkedList<String>();  
    
		System.out.println("Initial list of elements: "+ll_names);  
        
        ll_names.add("Ravi");  
        ll_names.add("Vijay");  
        ll_names.add("Ajay");  
        System.out.println("Linked List names : "+ll_names); 
        
        
        l_names.add("Ravi");  
        l_names.add("Vijay");  
        l_names.add("Ajay");
        System.out.println("Array List names : "+ l_names); 
        
        //Adding an element at the specific position  
        ll_names.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+ll_names);  
        
        l_names.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+l_names);  
       
        
        ll_names.addFirst("Rahul");
        ll_names.addLast("Last name");
        System.out.println("After invoking addFirst and addLast methods: "+ll_names);  
        
        LinkedList<String> second_ll=new LinkedList<String>();  
        second_ll.add("Sonoo");  
        second_ll.add("Hanumat");  
        //Adding second list elements to the first list  
        ll_names.addAll(second_ll);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll_names);  
        
        LinkedList<String> third_ll=new LinkedList<String>();  
        third_ll.add("John");  
        third_ll.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        ll_names.addAll(1, third_ll);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll_names);  
        
        //contains collections
        System.out.println(ll_names.containsAll(third_ll));
        
        //peeks gets the first element
        System.out.println(ll_names.peek());
        System.out.println(ll_names.peekLast());
        System.out.println(ll_names.subList(0, 5));
        
        //poll removes
        System.out.println(ll_names.poll());
        
        //pop also removes, but give error when the list is empty
        System.out.println(ll_names.pop());
        
        System.out.println(ll_names);
        
        while(!ll_names.isEmpty()) {
        	//process the element using poll
        	System.out.println(ll_names.poll());
        }
		
	}
}


