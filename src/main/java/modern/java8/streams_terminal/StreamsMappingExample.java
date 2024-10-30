package modern.java8.streams_terminal;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> namesList =
        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println("namesList : " + namesList);
    }
}
