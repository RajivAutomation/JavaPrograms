package pkg;

public class InvertString {

	public static void main(String[] args) {
		
	
	String y = "America";
	
	char x[] = y.toCharArray();
	int size = x.length;
	
	char a[] = new char [size];
	
	int i=0;
	
	
	while (i!=size) {
		
		a[i]= x[size-1-i];
		++i;
	}
	
System.out.println(x);
System.out.println(a);
	}
	
}















































































































