package modern.java8.functionalInterfaces;

import java.util.List;
import java.util.function.Supplier;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class SupplierExample {

	static Supplier<Integer> numberSupplier = () -> {
		return 100;
	};

	static Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();

	public static void main(String[] args) {
		System.out.println("Supplier called : " + numberSupplier.get());

		System.out.println(studentsSupplier.get());
	}
}
