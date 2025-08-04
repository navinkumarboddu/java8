package com.java8.modern.java8.constructor_methodref;

import java.util.function.Predicate;

import com.java8.modern.java8.data.Student;
import com.java8.modern.java8.data.StudentDataBase;

public class RefactorMethodRefExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = RefactorMethodRefExample::greaterThanGradeLeverl;

	public static boolean greaterThanGradeLeverl(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
	}
}
