package modern.java8.functionalInterfaces;

public class FunctionExample1 {

	public static String performConcat(String s) {
		return FunctionExample.addSome.apply(s);
	}

	public static void main(String[] args) {

		String result = performConcat("Hello");

		System.out.println("Result : " + result);
	}
}
