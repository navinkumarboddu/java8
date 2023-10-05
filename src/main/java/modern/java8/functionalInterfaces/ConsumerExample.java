package modern.java8.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c2 = (s) -> System.out.println(s);
	static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
	static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

	public static void printStudents() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.stream().forEach(c2);
	}

	public static void printNameAndActivities() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.stream().forEach(c3.andThen(c4));

	}

	public static void printNameAndActivitiesUsingCondition() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		System.out.println("Conditional ...");
		studentList.stream().forEach(s -> {
			if (s.getGradeLevel() >= 3 && s.getGpa() >= 3.9) {
				c3.andThen(c4);
			}
		});

	}

	public static void main(String[] args) {

		Consumer<String> consumer = (s) -> System.out.println(s);

		consumer.accept("Java");

		printStudents();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}
}
