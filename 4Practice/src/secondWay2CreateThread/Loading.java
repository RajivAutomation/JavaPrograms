package secondWay2CreateThread;

public class Loading implements Runnable{
//Second Way to Create Thread is to implement Runnable Interface
//Implement the Run() Method. Then, create a new Thread object, pass the Runnable Class to its constructors	
// and start the Thread by calling the start() Method
	
	public void run(){
		System.out.println("Hellow!");
	}
	
}
