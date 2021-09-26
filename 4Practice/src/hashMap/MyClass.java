package hashMap;

import java.util.HashMap;

public class MyClass {

	public static void main(String[] args) {
		
		HashMap <String, Integer> hm =  new HashMap<String, Integer>();
		hm.put("Radha", 124);
		hm.put("shyaM", 426);
		hm.put("Goverdhan", 220);
		
		System.out.println(hm.get("Goverdhan")); // Use the get method and the corresponding key to access the HashMap elements.
		
		// Iterating over the Hash map using "Enhanced for loop"
		for(String key: hm.keySet()){
			System.out.println(key);
		}
		
		// Has two Methods -> 1. containsKey 2. 
		System.out.println(hm.containsKey("shyam")); // gives the result in form of boolean
		
		System.out.println(hm.containsValue(124)); // returns the boolean value of the value that we gave. To determine the 
		//presence of a specified key or value
	}
}
