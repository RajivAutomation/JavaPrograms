package sortingOfList;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SortingOfIntegers {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(500);
		AL.add(2);
		AL.add(400);
		AL.add(35);
		AL.add(55);
		
		Collections.sort(AL); // Collections Class is used to sort the Integer set of numbers in Ascending order. Sort() is its method
		
		System.out.println(AL);
		
		
		Collections.reverse(AL); // Reversess the Sequence in the List
		System.out.println(AL);
		
		System.out.println(Collections.max(AL));// Will Return the maximum elemenet in AL 

		System.out.println(Collections.min(AL));// Will Return the minimum elemenet in AL
		
		Collections.shuffle(AL);
		System.out.println(AL);
		
	}
}
