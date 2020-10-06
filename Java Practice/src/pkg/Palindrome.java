package pkg;

public class Palindrome {

	public static void main(String[] args) {

		String y="liiril";
		char x[] =y.toCharArray();
		int size =x.length;
		System.out.println(size);
		
		char a[]= new char[size];
		
		int i=0;
		
		while (i!=size) {
			
				
			a[i]=x[size-1-i];
			
			if (a[i] != x[i]) {
				
				System.out.println("Its not a palindrome");
				System.exit(0);
			}
			else {
				++i;
				continue;

			}
				
		}
			System.out.println("Its' a Palindrome");
	}

}
