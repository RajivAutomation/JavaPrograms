package arrayList;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Pink");
		colors.remove("Black");
		
		System.out.println(colors);
		
		System.out.println(colors.contains("brown"));
		
		// will return Boolean True or False
		 
		colors.get(1); // will return the Color at the Index at 1 position
		System.out.println(colors.get(1));
		
	}
	
}
