package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviorParameterizationExercise {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//Basic Implementation
		System.out.println("Basic Implementation...");
		System.out.println("Even Numbers:");
		numbers.stream()
			.filter(x -> x%2 == 0)
			.map(n -> n*n)
			.forEach(System.out::println);
		
		System.out.println("Odd Numbers:");
		numbers.stream()
			.filter(x -> x%2 != 0)
			.map(n -> n*n)
			.forEach(System.out::println);
		
		System.out.println("Functional Interface Implementation...");
		System.out.println("Even Numbers:");
		filterAndPrint(numbers, x -> x%2 == 0, n -> n*n*n);
		
		System.out.println("Odd Numbers:");
		filterAndPrint(numbers, x -> x%2 != 0, n -> n*n);
	}

	private static void filterAndPrint(List<Integer> numbers, 
			Predicate<? super Integer> predicate,
			Function<? super Integer, ? extends Integer> mappingFunction) {
		numbers.stream()
			.filter(predicate)
			.map(mappingFunction)
			.forEach(System.out::println);
	}
}
