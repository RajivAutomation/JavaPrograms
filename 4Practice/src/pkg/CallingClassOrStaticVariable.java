package pkg;

public class CallingClassOrStaticVariable extends ClassOrStaticVariableProduct {

//	public int setBarCode;

	public static void main(String[] args) {
		CallingClassOrStaticVariable object = new CallingClassOrStaticVariable();
		object.setBarCode(40);
		
		CallingClassOrStaticVariable obj = new CallingClassOrStaticVariable();
		obj.setBarCode(50);
		
		System.out.println(object.getBarCode());
		System.out.println(obj.getBarCode());
		
		
		
	}
}
