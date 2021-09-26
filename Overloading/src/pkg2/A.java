package pkg2;

public class A {

//Overloading = Presence of Same Name but different Signature (No. of Arguments and Data Type)	
	
	public void sum(int a, int b){
		
		System.out.println(a+b);
	}
	
	public void sum(double a, double b){
		
		System.out.println(a+b);
	}

//Above is an example of  "Polymorphism" i.e. Method with same name but diff Signature. Both have same name, 2 Arguments But their Data Type is different  	
	
	public void sum(int a, int b, int c){
		
		System.out.println(a+b+c); // Number of Arguments
		
	}
	
	
	
}
