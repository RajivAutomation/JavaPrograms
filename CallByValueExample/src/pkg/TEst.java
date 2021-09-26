package pkg;

public class TEst {

	public void callbyvalue(int x){
		x=100;
	}
	
	public static void main(String[] args) {
		int x=50;
		
		TEst t = new TEst();
		t.callbyvalue(x);// calling Method
		System.out.println(x);
		
	}

/*Difference between Functions and Methods :->
Functions :-> Are defined in the Structural Programming Language (subset of 
Procedural Programming Language = in which all computations are in form of Procedures (series
of computational steps to be carried out)) like C, Fortan, COBOL

Methods :-> Are defined in the Object Oriented Language like Java
Object Oriented Programming Language where all the computations (instructions to the computer)
are carried out using Objects
*/
	
}
