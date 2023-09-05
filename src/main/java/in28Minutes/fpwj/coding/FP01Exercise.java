package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;

public class FP01Exercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		printAllOddNumbers(numbers);
		
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		//print courses
		System.out.println("Print courses");
		courses.stream()
			.forEach(System.out::println);
		
		//print courses containing Spring
		System.out.println("Print courses containing Spring");
		courses.stream()
			.filter(c -> c.toLowerCase().contains("Spring".toLowerCase()))
			.forEach(System.out::println);
		
		//print courses length > 4
		System.out.println("print courses length > 4");
		courses.stream()
			.filter(c -> c.length() > 4)
			.forEach(System.out::println);
	}

	private static void printAllOddNumbers(List<Integer> numbers) {
		// print Odd Numbers
		System.out.println("Odd Numbers");
		numbers.stream()
			.filter( n -> n%2 != 0)
			.forEach(System.out::println);
	}
}
