package pkg;

public class Main {

	public static void main(String[] args) {
	
		Product obj = new Product();
		obj.barcode=10;
		
		Product obj1 = new Product();
		obj1.barcode=20;
		
		System.out.println(obj.barcode);
		System.out.println(obj1.barcode);
		obj.brand();
		
	} 
	
}
