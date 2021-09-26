package pkg;

public class SwitchDayExample {

	/*
	 Switch statement = Is a Statement that checks the Variable for equality against the list of Values.
	 Each list of Values are called the "Cases" And, the Variable being Switched on is checked for each case.
	 Note :-> Each Case is followed by "Comparison Value" and a "Colon"
	 * 
	 * SYNTAX :->
	 * 
	 * DataType variable(Name) = value;
	* Switch (expression) {
	 * case value1 :
	 //Statements
	  * break; // optional
	  * case value2 :
	  //statements
	   * break; //optional
	   * case value3 :
	   //statements
	    * break; //optional
	    * default : // Optional
	    //Statements
	     } 	
	 */
	

	public static void main(String[] args) {
	
		int day = 3;
		
		switch (day){
		case 1 : 
			System.out.println("Day is Monday");
			break;
		case 2 :
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		default:
			System.out.println("No Day is present among the choices given");
		}
	}
	
}
