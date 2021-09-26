package dynamicDispatchMethod;

public class ChildTest extends ParentABC {

	
	public void disp(){
		System.out.println("disp() Method of the Child Class");
	}
	
	public void xyz(){
		System.out.println("xyz() Method of the Child Class");
	}
	
	
	public static void main(String[] args) {
		
		ParentABC obj = new ChildTest();
		obj.abc();
		obj.disp();
		
	}
	
}
