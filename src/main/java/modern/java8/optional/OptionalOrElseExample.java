package modern.java8.optional;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
    }
}
