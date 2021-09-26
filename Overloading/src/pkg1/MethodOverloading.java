package pkg1;

public class MethodOverloading {

	static int max(int a, int b){
		if (a>b){
			return a;
		}
		else{
			return b;
		}
			
	}
	
	
	static double max(double a, double b){
		if (a> b){
			return a;
		}
		else {
			return b;
		}
	}
	
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	System.out.println(max(5.6, 3.6));
	System.out.println(max(200, 100));
}
	
	
	
}
