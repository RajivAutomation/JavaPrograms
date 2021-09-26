package pkg;

public class TwoDimArray {

	/*
	 * MultiDimensional Array  - Are Arrays that are more than 1 Dimensional. Are Two Dimensional Array
	 * int [][] multiDimArray = {{2,4,6},{2,8,9,1}};
	 */
	
	
//	What is the output of this code?		
			int result = 0;
			{
			for (int i = 0; i < 5; i++) {
			  if (i == 3) { 
			     result += 10;
			   } else {
			     result += i;
			   }	
			}
			System.out.println(result);
}
}

//0, 1, 3, 13, 