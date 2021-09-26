package pkg1;

public class B {

	public static void main(String[] args) {
	
		A obj = new A();
		obj.getData(); // Accessing a Method (class member) using an object
		System.out.println(obj);
//Class Member can be = It could be Method, Or, It could be variable
		
//Below, I Am accessing a variable using an object and setting its value 
		obj.a = 100;// Accessing a variable using an object and setting its value to 100
		
		// below calling the method
		obj.getData(); 
		
	}
	
}
