package pkg1;

public class AddExample {

	static int sum;
	public void Sum (int a, int b){
		sum = a+b;
		System.out.println("The sum is: "+ sum);
	}
	
	public void sum(int a, int b, int c){
		sum=a+b+c;
		System.out.println("The Sum is: "+sum);
	}
	
	public static void main(String[] args) {
		AddExample obj = new AddExample();
		obj.Sum(4, 5);
		obj.sum(2, 4, 8);
		
		System.out.println(sum);
		
	}
	
}
