package modern.java8.constructor_methodref;

import java.util.function.Consumer;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class ConsumerMethodRefExample {

	static Consumer<Student> c1 = p -> System.out.println(p);

	static Consumer<Student> c2 = System.out::println;

	static Consumer<Student> c3 = Student::printListOfActivities;

	public static void main(String[] args) {
		// StudentDataBase.getAllStudents().forEach(c1);

		// StudentDataBase.getAllStudents().forEach(c2);

		StudentDataBase.getAllStudents().forEach(c3);
	}
}
