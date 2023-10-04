package modern.java8.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 5, 6, 7, 2, 4, 3, 6);

		/**
		 * Imperative - how style of programming
		 */
		List<Integer> uniqueList = new ArrayList<>();
		for (Integer i : numList) {
			if (!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}

		System.out.println("Imperative Approach :" + uniqueList.toString());

		/**
		 * Declarative - What style of programming
		 */
		List<Integer> uniqueList1 = numList.stream().distinct().collect(Collectors.toList());

		System.out.println("Declarative Approach :" + uniqueList1.toString());
	}

}
