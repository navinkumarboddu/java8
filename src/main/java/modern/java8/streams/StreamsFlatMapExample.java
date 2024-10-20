package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){
        List<String> studentActivities =
        StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {
    }
}
