package pkg;

/*
The "toString() Method returns the String representation of the Object

If you print any object, java compiler internally invokes the "toString()" method on the object. Overriding
this method will return the specified values.

*/


public class Student {

	int rollno;
	String name;
	String city;
	
	Student (int rollno, String name, String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}

	public String toString(){
		return rollno+ "       " + name+ " " +city;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(10, "Mike", "Oklahoma");
		Student s2 = new Student(20, "Michael","Okla");
		
		System.out.println(s1);// Compiler will write here s1.toString()
		System.out.println(s2); // Compiler will write here s2.soString()
		
	}
}
