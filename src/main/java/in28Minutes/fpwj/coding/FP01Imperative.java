package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01Imperative {
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		printAllNumbers(numbers);
		printAllEvenNumbers(numbers);
	}
	
	private static void printAllNumbers(List<Integer> numbers) {
		// for each loop
		System.out.println("All Numbers");
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void printAllEvenNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers:");
		for (Integer number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

	
	
}