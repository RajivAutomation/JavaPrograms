package hashSet;

import java.util.HashSet;

public class MyClass {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("F");
		set.add("E");
		
		System.out.println(set); //  print the elements in the Hashset 
		
		System.out.println(set.size()); // result the size of the HashSet. Using the size() Method
		
//Using 'Enhanced For Loop' - To iterate over the HashSet
		
		for (String hset: set){
			System.out.println(hset);
		}
		
	}
	
}
