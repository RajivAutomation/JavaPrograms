package linkedList;

import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) {
		
		LinkedList<String> c = new LinkedList<String>();
		c.add("Red");
		c.add("Blue");
		c.add("Black");
		c.add("Pink");
		c.remove("Black");
		System.out.println(c);
		
		//enhanced for loop to iterate over its elements
		for (String s:c){
			System.out.println(s);
		}
	}
}
