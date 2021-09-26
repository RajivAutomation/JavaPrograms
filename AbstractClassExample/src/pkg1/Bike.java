package pkg1;

abstract class Bike {

	abstract void run(); // Abstract Method
	
public void speed1(){ // Non Abstract Method
	System.out.println("This is Non Abstract Method of the Abstract Class Bike");
}
	
public static void speed2(){ // Non Abstract Method
	System.out.println("This is Non Abstract Method of Parent Abstract Class Bike");
}

}

/*
Abstract Class = Class declared by keyword 'Abstract'.  Class that can have Abstract Method (Only declaration and no body)
and Nob Abstract Method (Method with body). 
IMP-> It needs to be extended by Child Class and its Method needs to be implemented by child class

*/