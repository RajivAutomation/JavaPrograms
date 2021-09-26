package pkg1;

public class Honda extends Bike{

	void run() {
System.out.println("running safely. Method of Parent class extending parent Abstract class, giving its implementation");		
	}

	public void Mileage(){
	System.out.println("Honda got good Mileage. Is a Child Class Method");	
	}
	public static void main(String[] args) {
	
		Bike obj = new Honda();// when Parent Class is on RHS, then only those Methods will be called
		// that are Common in both Classes and All the Methods of Parent Class
		obj.run();
		obj.speed1();
		obj.speed2();
		
		Honda obj1 = new Honda();
		obj1.run();
		
	}
	
	
}
