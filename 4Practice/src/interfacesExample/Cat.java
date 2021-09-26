package interfacesExample;

class Cat implements Animal{ // When you implements Interface, you need to override all of its methods
	public void eat(){
		System.out.println("Cat eats RAT");
	}
	
public void makeSound(){
	System.out.println("MeoWwwww!!");
}

}
