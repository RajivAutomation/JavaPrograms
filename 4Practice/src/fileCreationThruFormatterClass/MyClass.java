package fileCreationThruFormatterClass;

import java.util.Formatter;

public class MyClass {

	public static void main(String[] args) {
		
// Formatter is the Class in Java - used to create content and write it to Files. Will create an empty file at the location
//Formatter is the Class. When we create object of it, it will call the constructor. And, in Constructor, we are passing the File Path		
	try{
	Formatter fm = new Formatter("D:\\Rajiv\\test.txt");
	
// writing the "format()" Method of the Formatter Class to write contents to the file
	fm.format("%s %s %s", 1, "Rajiv", "Kukreti \r\n"); // 
	fm.format("%s %s %s", 2, "Shruti", "Kukreti");
//%s mean a string and get's replaced by the first parameter after the format. 
//The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces	
	
	fm.close(); // Will close the File
	}catch (Exception e){
	System.out.println("Error!");	
	}
}

}