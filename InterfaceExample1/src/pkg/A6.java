package pkg;

public class A6 implements Printable{

	public void print(){
		System.out.println("Hello");
		System.out.println("Aded body in implemented Interface");
	}
	
	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
		
	}
	
}

/*
Interface :->
Interface is a Class starting with keyword 'interface' and can have ONLY Abstract Methods(i.e. Only Method declare but not define, no body)
It is used to achieve abstraction and multiple inheritance
Interface CAN NOT be instantiated like Abstract Class
Imp-> In Interface, By Default, All Methods are 'public' & 'abstract' and data members are
'public', 'static' & 'final'
Class has to 'implement' an interface
*/