package modern.java8.constructor_methodref;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();

	static Function<String, String> toUpperCaseMethodRef =  String::toUpperCase;

	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("java8"));

		System.out.println(toUpperCaseMethodRef.apply("java8"));
	}
}
