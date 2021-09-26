package sortingOfList;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("America");
		AL.add("Denmark");
		AL.add("Zimbabwe");
		AL.add("Nigeria");
		AL.add("India");
		
		Collections.sort(AL);// Collections is a class which will sort the ArrayList
		
		System.out.println(AL);
	}
}
