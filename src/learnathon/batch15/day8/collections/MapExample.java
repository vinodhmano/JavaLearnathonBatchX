package learnathon.batch15.day8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;  

class MapExample{  

public static void main(String args[]){  
	//Creating a Map
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	
	// Adding key and value to the map
	map.put(100,"TOM");  
	map.put(101,"JOHN");  
	map.put(102,"SAM");
	map.put(102,"VICTOR");
	map.put(104, "TOM");
	
	//Iterate to print the key and value.
	for(Map.Entry<Integer,String> m:map.entrySet()){  
		System.out.println(m.getKey()+"-->"+m.getValue());  
	}  
	
	//Another example to store error codes and values
	HashMap<Integer, String> errorCode = new HashMap<Integer, String>();
	errorCode.putIfAbsent(200, "OK");
	errorCode.putIfAbsent(401, "UNAUTHORIZED");
	errorCode.putIfAbsent(403, "FORBIDDEN");
	errorCode.putIfAbsent(404, "PAGE NOT FOUND");
	
	System.out.println(errorCode.keySet());
	System.out.println(errorCode.values());
	System.out.println(errorCode.get(404));


	//Example to store another collection in hashmap
	HashMap<String, ArrayList<String>> phoneModels = new HashMap<String, ArrayList<String>>();
	phoneModels.put("apple", new ArrayList<String>(Arrays.asList("Iphone 11", "Iphone 11 Pro", "Iphone 11 Pro Max")));
	phoneModels.put("google", new ArrayList<String>(Arrays.asList("Pixel 3", "Pixel 3 XL", "Pixel 3a", "Pixel 3a XL")));
	phoneModels.put("samsung", new ArrayList<String>(Arrays.asList("Galaxy S10", "Galaxy S10e", "Galaxy S10 Plus", "Note 10", "Note 10 Plus")));
	
	//Iterate to print the key and value.
		for(Entry<String,ArrayList<String>> p :phoneModels.entrySet()){  
			System.out.println(p.getKey()+"-->"+p.getValue());  
		} 
	
}  
}

