package pkg;

public class TypeCastingExample {
/*
 * Type Casting= is assigning a value of one type to the variable of another type
 * How to Do => Whatever type you want to cast variable value to, put in parenthesis and in front of the value
 */
	
	static int a = (int)3.14;
	static double b = (int)42.452;
	
public static void typecast(){
	System.out.println(a);

	
}

public static void secondTypeCast(){
	System.out.println(b);
}

public static void main(String[] args) {
	typecast(); // result = 3
	secondTypeCast(); // result = 42.0
	
	
	
	
}	
}
