package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FP03FunctionalInterfacesExercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		//Basic Implementation
		numbers.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
		
		//Exercise 12: Using Functional Interfaces
		BinaryOperator<Integer> operator = Integer::sum;
		BinaryOperator<Integer> operator1 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		
		};
		
		numbers.stream().filter(n -> n % 2 == 0).reduce(0, operator);
	}
}