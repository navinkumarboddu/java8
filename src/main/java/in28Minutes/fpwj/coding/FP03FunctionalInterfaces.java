package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
	
	/*
	 * boolean isEven(int number){
	 *     return number%2 == 0;
	 * }
	 * 
	 * int squared(int x){
	 * 	   return x*x;
	 * }
	 */

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//Basic Implementation
		System.out.println("Basic Implementation...");
		numbers.stream()
			.filter(x -> x%2 == 0)
			.map(n -> n*n)
			.forEach(System.out::println);
		
		System.out.println("Function Implementation...");
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		
		};
		
		Function<Integer, Integer> squareFunction = n -> n*n;
		Function<Integer, Integer> squFunction = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
			
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysConsumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		
		};
		
		numbers.stream()
			.filter(isEvenPredicate)
			.map(squareFunction)
			.forEach(sysoutConsumer);
	}
}
