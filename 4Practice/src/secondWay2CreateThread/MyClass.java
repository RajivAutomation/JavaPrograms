package secondWay2CreateThread;

public class MyClass {

	public static void main(String[] args) {
		Thread t = new Thread(new Loading());// loading Class passed to its constructor
		t.start();
	}
}

/*Explanation:->
 * When you write this line -> Thread t = new Thread();
 * new Thread() -> Will create the Object and automatically its Default Constructor will be called
 * So, instead of its default constructor, we are passing the Class itself as its parameter in Thread t = new Thread(new Loading()) 
 */