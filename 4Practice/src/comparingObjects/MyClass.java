package comparingObjects;

public class MyClass {

	public static void main(String[] args) {
		
		Animal a1 =  new Animal("rat"); // same name object rat
		Animal a2 = new Animal ("rat");
		
		System.out.println(a1==a2);
		
	}
}

/*
 * Comparing Objects

Remember that when you create objects, the variables store references to the objects.
So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.

Note=> Despite having two objects with the same name, the equality testing returns false, because we have two different objects
 (two different references or memory locations)

*/
