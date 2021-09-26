package pkg;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <Integer> weeklyTemperature = new ArrayList <Integer>();
		weeklyTemperature.add(78);
		weeklyTemperature.add(42);
		weeklyTemperature.add(10);
		
		for (Integer temperature : weeklyTemperature){
			System.out.println(temperature);
		}
		
	}
}
