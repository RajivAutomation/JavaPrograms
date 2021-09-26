package pkg;

/* Instance Variable = Unlike Static VAriable, Instance Variables have their own separate copy of 
 * Instance VAriable. 
Each instance (Object) of Class has its own copy of instance Variable. So, if you change the value of 
Instance Variable using the object "obj2", and then on displaying the value of Variables using all Objects ,
Only the Obj2 value get change.
*/

public class InstanceVariable {

	public String myClassVar="Instance Variable";
	
	
	public static void main(String[] args) {
	
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		
		obj2.myClassVar="New Instance Variable after changing it";
		
		
		System.out.println(obj.myClassVar);
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);

		
		
	}
	
	
}

