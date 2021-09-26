package xceptionsInJava;

public class UnCheckedExceptions {

	/*
	UnChecked Exception :-> Are the Exceptions that are not checked at Compile time but are checked at Run Time. This means, even your
	program is throwing an Unchecked Exception and even it is not handled by user, it won't give a compilation error. 
	Mostly, it is due to the incorrect data provided to the program.  
	All Unchecked Exception are direct subclass of 'RuntimeException'
	Below are the examples of Unchecked Exception  :->
	NullPointerException , IllegalArgumentException
	Arithmetic Exception = E.g. When deviding a number by '0'; 
	ArrayIndexOutOfBoundsException = E.g. When Array element at 8th position is accessed from an Array having Size of only 4 elements.

	*/
	
	public static void main(String[] args) {
		
		int num =0;
		int num1 = 10;
		
		int res = num1/num; // Deviding num1 i.e. 10 by num i.e. 0 => 10/0 = infinite
		System.out.println(res);  
		
		/*
		Since, we are deviding an integer by 0, it will give Runtime Unchecked Exception called "Arithmetic Exception" 
		*/
	}

	
	
}
