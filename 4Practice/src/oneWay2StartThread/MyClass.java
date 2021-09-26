package oneWay2StartThread;


public class MyClass {

	public static void main(String[] args) {
//Create a object of Thread, Pass the Runnable Class to its Constructor		
		Thread t = new Thread(new Loader()); 
		t.start(); // Start the Thread
	}
}
