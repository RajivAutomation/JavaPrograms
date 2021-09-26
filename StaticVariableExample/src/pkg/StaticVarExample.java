package pkg;

/*
Static Variables are known as a "Class Variable" because they are associated with the Class and common for
all the instances of the Class. i.e. obj.myClassVar, obj1.myClassVar, obj2.myClassVar will have same value 
of Static Variable. if I Change, it by One Object i.e. obj.myClassVar, obj2.myClassVar, it will change the value for all its instances if created
i.e. obj1.myClassVar, obj2.myClassVar also.
*/

public class StaticVarExample {

	public static String myClassVar="Class or static Variable"; 
	
	public static void main(String[] args) {
	// creating three different instances of the Class StaticVarExample
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj1 = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
		//changing the value of the Static Variable by one object
		obj.myClassVar="New Text now after changing";
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
/*As we can see that all three Statements result in the same output irrespective of through what object it
 * is being accessed. That is why "We can access the Static Variables without using the Object Name  like :-> 

*/
		System.out.println(myClassVar);
	}
	
}
