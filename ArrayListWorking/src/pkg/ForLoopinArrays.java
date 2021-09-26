package pkg;

public class ForLoopinArrays {

	public static void main(String[] args) {
		
		int[] myArr = {6,42,3,7};
		int sum =0;
		
		for (int i =0; i<myArr.length; i++){
			sum+=myArr[i]; // "sum+" = Means, it will add to 'sum' first and then, add to it the number at myArr[i]
			// i.e. sum = sum+myArr[0] i.e. sum = 0+6 = 6. Then, sum = 6+myArr[1] = 6+42 = 48 and so on till i<>myArr.length
		}
		System.out.println(sum);
	}
	
}
