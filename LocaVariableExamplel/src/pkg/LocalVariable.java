package pkg;

public class LocalVariable {

	//Instance Variable
	public String myClassVar="This is Instance Variable";
	
	public void myMethod(){
		myClassVar="Changed Instance Variable Inside Method Variable";
		System.out.println(myClassVar);
	}
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		
		System.out.println("Calling the Method");
		
		obj.myMethod();
		
		System.out.println(obj.myClassVar);
		//System.out.println(myClassVar);
	}
	
}
