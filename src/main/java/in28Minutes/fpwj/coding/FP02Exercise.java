package in28Minutes.fpwj.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JShell Output
 * 
 * jshell> List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15)
 * numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
 * 
 * jshell> numbers
 * numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
 * 
 * jshell> numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
 * $3 ==> 835
 * 
 * jshell> numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum);
 * $4 ==> 10109
 * 
 * jshell> numbers.stream().filter( n -> n%2==1).reduce(0, Integer::sum);
 * $5 ==> 37
 * 
 * jshell> numbers.stream().filter( n -> n%2==0).reduce(0, Integer::sum);
 * $6 ==> 40
 *
 * jshell> List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes")
 * courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
 * 
 * jshell> courses.stream().map(c->c.length()).collect(Collectors.toList())
 * $2 ==> [6, 11, 3, 13, 3, 3, 5, 6, 10]
 * 
 * 
 */

public class FP02Exercise {
	//Check the Jshell for Exercise 7,8 & 9 and write the code
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//Exercise 10
		List<Integer> evenNumbers = numbers.stream()
										.filter(n-> n%2==0)
										.collect(Collectors.toList());
		System.out.println("Even List:");
		evenNumbers.stream()
			.forEach(System.out::println);

		//Exercise 11
		List<Integer> lenList = courses.stream()
									.map(c-> c.length())
									.collect(Collectors.toList());
		System.out.println("Courses Length List:");
		lenList.stream()
			.forEach(System.out::println);
	}
	
	
}
