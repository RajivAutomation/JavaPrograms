package pkg1;

// ITS A PARENT CLASS GETTING EXTENDED INTO BOY CLASS
public class Human {

	
	public void eat(){
		System.out.println("Human eats");
	}
}

/*Overriding = Declaring a method in SubClass (i.e. Boy Class) that is already present in Parent Class (i.e. Human Class)
Advantage - It can gives its own implementation to the INherited Class i.e. Parent Class here, without modifying it

Both Class - Parent Class (Human) and Child Class (Boy) has method "eat()" 
but Boy() class is giving its implementation to the "eat()" method i.e. actually it is overriding it 
*/