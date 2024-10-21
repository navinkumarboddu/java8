package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public  static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //filter by Gender
        filterStudents().forEach(System.out::println);
    }
}
