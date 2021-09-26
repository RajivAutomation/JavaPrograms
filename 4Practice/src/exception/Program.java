package exception;

public class Program {

	public static int div(int a, int b) throws ArithmeticException{
		if(b==0) {
//An Object of 'IOException' exception class is created using "new" keyword			
			throw new ArithmeticException("Division byy Zeerooo");
			//System.out.println();
		}else{
			return a/b;
		}
		
		
			
	}
	
	// Following avg() Method created for sake of different example only, its nothing to do with this Program
	static void avg(){
		System.out.println("Hi Avg");
	}
	
	
	public static void main(String[] args) {
		System.out.println(div(42,0));
		
		avg(); // calling method or function
	}
}
