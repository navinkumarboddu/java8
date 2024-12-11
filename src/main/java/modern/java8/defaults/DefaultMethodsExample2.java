package modern.java8.defaults;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //System.out.println(studentList);

        studentList.forEach(studentConsumer);
    }
}
