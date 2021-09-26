package pkg;

public class Mouse extends Rodentia {

	String name;
	
	public Mouse(String name){
		this.name=name;
	}
	
	public void eat(){
		System.out.println(name + " eat Cheezy Pizzas!!");
	}
	
	public void SolveMaze(int minutes){
		minutes=3;
		System.out.println(name + " solve the Maze in "+minutes + " minutes");
	}
	
	public static void main(String[] args) {
	Mouse ratly = new Mouse("MickyMouse");	
	//ratly.name="MickyMouse";
	ratly.eat();
	ratly.SolveMaze(3);
	ratly.order();
	
	}
}
