package xceptionsInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
	
/*Following is the Hierarchy of Exceptions :->
 * Object -> Throwable -> Exception -> IOException -> FileNotFoundException    
*/
	

/*There are 2 Types of Exceptions = 1. Checked Exception 2. UnChecked Exceptions
Checked Exceptions :-> Are those exceptions that are checked at Compile Time. That is, if any method is giving a 
Checked exception then it should handle the exception using the "try and catch block" OR, it should declare the exception using "Throws Keyword"
otherwise, the program will give compilation error.
Checked Exception Types are -> IOException, FileNotFoundException, SQLException, DataAccessException, ClassNotFoundException 
*/
	
	 
//		public static void main(String[] args) { throws IOException, FileNotFoundException
//Since, all the compile time exception are subclass of "IOException", we can only write IOException like this below :
//		public static void main(String[] args) throws IOException { 		
// 2 Ways to Handle Exception :-> 1. write "Throws IOException" 2. put the code block that will give exception in try catch block

	/*	public static void main(String[] args) throws IOException{
		FileInputStream fis;
		fis = new FileInputStream ("D:\\Rajiv\\try.txt");
		
		int k;
		while ((k=fis.read())!=-1){
			System.out.println(k);
			
		}
		fis.close();
	}

	
} 
*/
	
	//SECOND WAY IS TO  PUT THE CODE THAT IS SUPPOSED TOGIVE EXCEPTION IN TRY AND CATCH BLOCK :->
	
	public static void main(String[] args) {
		FileInputStream fis =null;
		
		try{
		fis = new FileInputStream ("D:\\Rajiv\\try.txt");
		}catch(FileNotFoundException fne){
			System.out.println("File not present");
		}
		
		
		int k;
		
		try {
		while ((k=fis.read())!=-1){
/*Non Static method are always called by the object name. Static Method can be called directly by class name
Read is a "non-static" method so we are calling it with Object fis. 
read() belongs to "FileInputStream" class, which is used to read a file. fis.read() will return an "int" value i.e. ASCII VALUE 
of that Integer. ASCII has range from 0 to 255. So, we are saying "till it is not equal to "-1" (which it will never be so will loop will 
always work) read all characters of the file. It will read and return next byte of data, or "-1" if the end of file (EOF) has been 
reached 
*/
			System.out.println((char)k); // (char)k = Converts integer to Character
			
		}
		fis.close();
		
		} catch(IOException ioe){
			System.out.println("I/O error occurred");
			
			ioe.printStackTrace();
	}

	
		
	}
}

/*
UnChecked Exception :-> Are the Exceptions that are not checked at Compile time but are checked at Run Time. This means, even your
program is throwing an Unchecked Exception and even it is not handled by user, it won't give a compilation error. 
Mostly, it is due to the incorrect data provided to the program.  
All Unchecked Exception are direct subclass of 'RuntimeException'
Below are the examples of Unchecked Exception  :->
NullPointerException , IllegalArgumentException
Arithmetic Exception = E.g. When deviding a number by '0'; 
ArrayIndexOutOfBoundsException = E.g. When Array element at 8th position is accessed from an Array having Size of only 4 elements.

*/

	
	
	