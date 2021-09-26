package innerClassExample;

class Robot {

	int id;
	
	Robot(int i){
		id=i;
		Brain b = new Brain();
		b.think();
		
		
		
	}
	
	public void outClassMethod(){
		System.out.println("Iam outClass Method");
	}
	
	private class Brain{
		public void think(){
			System.out.println(id + " " + " is thinking");
		}
	}
}
