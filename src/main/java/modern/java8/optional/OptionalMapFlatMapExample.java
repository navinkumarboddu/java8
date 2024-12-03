package modern.java8.optional;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.
                filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        optionalFilter();
    }
}
