package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01Exercise {
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		printAllNumbers(numbers);
		printAllNumbersFunctionalApproach(numbers);
	}
	
	private static void print(Integer number) {
		System.out.println(number);
	}

	private static void printAllNumbers(List<Integer> numbers) {
		// for each loop
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
	
	private static void  printAllNumbersFunctionalApproach(List<Integer> numbers) {
		Stream<Integer> s = numbers.stream();
		s.forEach(FP01Exercise::print);
	}
}