package in28Minutes.fpwj.coding;

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
 */

public class FP02Exercise {
	//Check the Jshell and write the code
}
