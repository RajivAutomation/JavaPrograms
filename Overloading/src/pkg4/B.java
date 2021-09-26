package pkg4;

import pkg4.A;
public class B extends A {

	public void sum(int a, int b){
		
		this.sub(6, 4); // Class A Method
		this.sum(4, 5); // Class B Method
		//System.out.println("this.sum(4, 5)"+ "Class B Method - Sum");
		
		this.sub(6, 4); // Class A Method
		System.out.println("Class A Method - Sub");
		
	}
	public static void main(String[] args) {
		B obj = new B();
		obj.sub(6,4);
	}
}
