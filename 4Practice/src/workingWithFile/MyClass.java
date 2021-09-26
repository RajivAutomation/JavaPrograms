package workingWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {

	
	public static void main(String[] args) {
// File is the Class and while creating the object if we are passing the Path of File to the Constructor that File was calling		
		File f = new File ("D:\\Rajiv\\type of testing we do.txt");
		System.out.println(f.exists()); // exists() will return boolean value if File at path is present or not
		
		if (f.exists()){
			System.out.println(f.getName() + " Exists!");
		}
		else{
		System.out.println(f.getName()+ " File do not exists");	
		}
		
		
		System.out.println(f.getName()); // getName() method will return 'Name' of the File
		
//Now to Read the File :-> We use the "Scanner Class". It takes the "File object" as input		
		
		
		try {
			Scanner sc = new Scanner(f); // We creating the Object of Scanner Class and Constructor when is called takes the File obj as input
			while(sc.hasNext()){
				System.out.print(" ");
				System.out.print(sc.next()); // Next() Method always reads 'Word' by 'word'
			}
			sc.close(); // Closingn the File once read. Always close the file once operation complete
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
	}
}
