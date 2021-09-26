package pkg;

public class ReturnTypeMethod {

	public static int sum(int var1, int var2){
		return var1+var2;
	}
	
	public static void main(String[] args) {
		int x = sum(2,5);
		
		System.out.println(x);
	}
}
