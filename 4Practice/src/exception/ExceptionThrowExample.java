package exception;

public class ExceptionThrowExample {

	/* First, we throw an ArithmeticException in the try{} block, then, catch it in catch{} block
	At last, we are calling this enrire method i.e. avg() in the main() method
	*/
	static void avg(){
		
		try{
		throw new ArithmeticException("Demo");
	}
	
	catch(ArithmeticException e){
		System.out.println("Exception has been Caught or Handled");
		
	}
}
	
	public static void main(String[] args) {
		
		avg(); // calling the Method or function 
	}
	}
