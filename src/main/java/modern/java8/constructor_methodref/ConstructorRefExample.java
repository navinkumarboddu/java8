package modern.java8.constructor_methodref;

import java.util.function.Function;
import java.util.function.Supplier;

import modern.java8.data.Student;

public class ConstructorRefExample {

	static Supplier<Student> studentSupplier = Student::new;

	static Function<String, Student> studentFunction = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());

		System.out.println(studentFunction.apply("abc"));
	}
}
