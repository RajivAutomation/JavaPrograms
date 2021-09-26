package constructorOverloading;

public class Cricketer {

/*
Constructor = A Constructor is a special method which is used to initialize an object.
It do not have any return method
Can not have 'static', 'final', 'synchronized' Modifiers

Two types of Constructors : -> 1. Default Constructor 2. Parameterized Constructor

Constructor Overloading -> Multiple Constructor with different Signature but with no return type
It is done to construct objects in different ways. 

*/
	
	String name;
	String team;
	int age;
	
	Cricketer(){ // default Constructor
		
		name="";
		team="";
		age=0;
	}
	
/* Parameters = Is a Variable that receives the value(s) when the Method is called e.g. void sum(int x, int y)
Arguments = Arguments is a value that is passed to a method when it is called e.g.  obj.sum(10, 20);
*/
	Cricketer(String n, String t, int a ){//(Parameterized construnctor)  Constructor Overloading
		name="a"; // arguments
		team="t";// arguments
		age=0;// arguments
		
				
	}
	
	Cricketer (Cricketer ckt){
		name= ckt.name;
		team = ckt.team;
		age=ckt.age;
		
	}
	
	public String toString(){
		return "This is "+name+" of "+team;
	}
}
