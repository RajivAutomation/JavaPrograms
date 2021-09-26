package iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) {
		LinkedList<String> animal = new LinkedList<String>();
		animal.add("Rabbit");
		animal.add("Zebra");
		animal.add("dog");
		animal.add("Cat");
		
		System.out.println(animal);
		System.out.println("!-------FIRST---------------------------------------!");		
		Collections.sort(animal);
		System.out.println(animal);
		System.out.println("!-------SECOND---------------------------------------!");
//Each of the Collection Class (e.g. here Animal) provides an "iterator()" Method that returns an 'Iterator' to the start of Collection		
		Iterator<String> it = animal.iterator();// "Animal" is a Collection
		
		boolean  t = it.hasNext(); // hasNext() -> Will return the Boolean value of 'true' if there is at least one more element 
		System.out.println(t);
		System.out.println("!-------THIRD---------------------------------------!");
		
		String value=it.next();// next()-> will Return the next object and advances the iterator
		System.out.println(value);
		System.out.println("!-------FOURTH---------------------------------------!");
		
		while (it.hasNext()){ // till it it 'true' i.e. Till there is atleast one element, iterator will iterate ie. move ahead
			System.out.println(it.next()); // till iterator return 'true' for hasNext(), keep on printing

			System.out.println("!-------FIFTH---------------------------------------!");
			
// Printing all the items in the Collection using 'Enhanced for Loop'
			
			for (String c: animal){
				System.out.println(c);
				System.out.println("!-------SIXTH---------------------------------------!");
			}
			
		}
	}
	
}
