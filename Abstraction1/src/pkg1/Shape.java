package pkg1;

abstract class Shape {

	abstract void draw(); // Abstract Method : i.e. No body only declaration
	
	void nonAbstrctMethodOfParentAbstractClass(){ // Non Abstract Method
		System.out.println("This is Non Abstract Method. You can keep both Abs and Nob Abs Method in Abstract Class");
	}
}
