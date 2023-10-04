package modern.java8.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {

		/**
		 * Imperative - how style of programming
		 */
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println("Imperative Approach :" + sum);

		/**
		 * Declarative - What style of programming
		 */
		int sum1 = IntStream.range(0, 100)
					.parallel()
					.sum();
		System.out.println("Declarative Approach : " + sum1);

	}

}
