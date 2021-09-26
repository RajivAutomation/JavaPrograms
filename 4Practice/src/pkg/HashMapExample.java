package pkg;

import java.util.HashMap;

public class HashMapExample {
//Hash Map contains a set of "Keys" and a Value for each Key
/*
We created a HashMap object "restaurantMenu". 
"restaurantMenu" HashMap will store keys of String data types
and values of Integer data types 
*/
	public static void main(String[] args) {
		HashMap <String, Integer> restaurantMenu = new HashMap <String, Integer> ();
		
		restaurantMenu.put("Mexian Totillas", 20);
		restaurantMenu.put("Italian Pizza", 40);
		restaurantMenu.put("Butter Naan", 60);
		restaurantMenu.put("Muglai Chicken", 100);
		
// TO ACCESS THE HASH MAP => WE SPECIFY THE KEY, CORRESPONDING TO THAT KEY, WE CAN GET THE VALUE FOR IT		
		
		Integer s= restaurantMenu.get("Muglai Chicken");//"get" Method of hashMap helps to access the VAlue 
		System.out.println(s);
		
		System.out.println(restaurantMenu.get("Italian Pizza"));

// ITERATING OVER A HASHmAP :=>	Using "for each loop" to iterate over each key in restaurantMenu
//The 'KeySet' Method of HashMap returns a list of Keys
		
		System.out.println("The list of Keys in the HasMap dataStructure by name restaurantMenu"
				+ " is " +restaurantMenu.keySet() );
		
		for (String item: restaurantMenu.keySet()){ //KeySet returns a list of Keys
			
			System.out.println("The cost of " + item + " is "+ restaurantMenu.get(item));
			
		}
		
	}
	
	
	
}
 