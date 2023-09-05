package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01Functional {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		//printAllNumbersFunctionalApproach(numbers);
		//printAllEvenNumbers(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}

	private static void print(Integer number) {
		System.out.println(number);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersFunctionalApproach(List<Integer> numbers) {
		System.out.println("All Numbers");
		numbers.stream()
			.forEach(FP01Functional::print); // Method Reference

		// Using sysout Method Reference
		numbers.stream()
			.forEach(System.out::println);
	}

	private static void printAllEvenNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers");
		numbers.stream()
		 	.filter(FP01Functional::isEven) // Filter Even Numbers
		 	.forEach(System.out::println);
		
		//Lambda Expression
		numbers.stream()
			.filter(n -> n%2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("Square Of Even Numbers");
		numbers.stream()
			.filter(n -> n%2==0)
			.map( n -> n*n)
			.forEach(System.out::println);
	}
}