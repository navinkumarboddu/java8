package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int sum = addListFunctional(numbers);
		System.out.println("Sum of numbers: " + sum);
		
		int total = addListFunctionalUsingLambda(numbers);
		System.out.println("Sum of numbers: " + total);
		
		int add = addListFunctionalUsingIntegerMethodReference(numbers);
		System.out.println("Sum of numbers: " + add);
	}

	private static int sum(int a, int b) {
		System.out.println(a + "," + b);
		return a + b;
	}

	//Method Reference
	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()
					.reduce(0, FP02Functional::sum);
	}
	
	//Lambda Expression
	private static int addListFunctionalUsingLambda(List<Integer> numbers) {
		return numbers.stream()
					.reduce(0, (x,y) -> x+y);
	}

	//Integer method sum
	private static int addListFunctionalUsingIntegerMethodReference(List<Integer> numbers) {
		return numbers.stream()
					.reduce(0, Integer::sum);
	}

}
