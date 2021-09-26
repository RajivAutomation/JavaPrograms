package pkg;

public class StaticDemoChild extends StaticDemo{ // Child Class
	
	public StaticDemoChild(){ // Child Class Constructor
		System.out.println("Iam a Child Class Constructor");
	}

	public void display(){
		System.out.println("Static Demo Child Class");
	}
	
	public static void main(String[] args) {
	
		StaticDemoChild obj = new StaticDemoChild();// just created objec to Child Class
		obj.display();//called the Method of Child Class
	}

	/*
	 * Result of Execution :->
	 * Iam Parent Constructor
Iam a Child Class Constructor
Static Demo Child Class

Reason => This is because, first of all Constructor runs by default whether there or not, it runs internally.
Secondly, it has inbuilt function "Super()", that calls its parent constructor in the parent class and runs it.
Thats why we getting first Parent Class Constructor as "Iam Parent Constructor", then it runs its own child class
constructor method "Iam a Child Class Constructor". Lastly, it will run any method of child class if it has. 

	*/
}
