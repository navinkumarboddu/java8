package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;

public class FP02Imperative {
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum = addListStructed(numbers);
		System.out.println("Sum of numbers: " + sum);
	}

	private static int addListStructed(List<Integer> numbers) {
		int sum=0;
		for (Integer n : numbers) {
			sum += n;
		}
		return sum;
	}
}
