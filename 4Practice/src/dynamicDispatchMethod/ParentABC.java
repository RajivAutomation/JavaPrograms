package dynamicDispatchMethod;

public class ParentABC {

	public String String;

	public void disp(){
		
		//int area;
		String String_one  = "10";
		String String_two  = "10";
		int area = Integer.parseInt("String_one")* Integer.parseInt("String_two") ;
		System.out.println(area);
		System.out.println("disp() Method of Parent Class");
	}
	
	public void abc(){
		System.out.println("abc() Method of Parent Class");
	}
	
}
