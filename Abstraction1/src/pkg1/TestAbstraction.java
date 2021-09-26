package pkg1;

public class TestAbstraction {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.nonAbstrctMethodOfParentAbstractClass();
		s.getClass();
		
	}
	
}
