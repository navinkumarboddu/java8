package modern.java8.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudentByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(s -> {
			if (p1.or(p2).negate().test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void main(String[] args) {
		System.out.println("By Grade Level");
		filterStudentByGradeLevel();

		System.out.println("By Gpa Level");
		filterStudentByGpa();

		System.out.println("Predicate Chaining !!!");
		filterStudents();
		// p1.or(p2).negate().test(s)
		// p1.and(p2).test(s)
		// p1.or(p2).test(s)
	}
}
