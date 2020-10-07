package pkg;

public class Copying1Str2Another {

	/*
	@author Rajiv
	*/
	
	public static void main(String[] args) {
		
		
		String x = "London is great";
		char y[] = x.toCharArray();
		
		int size = y.length;
		
		char a [] = new char [size];
		
		int i = 0;
		
		while (i!= size) {
			a[i]= y[i];
			++i;
		}
		
		System.out.println(a);
	}
}
