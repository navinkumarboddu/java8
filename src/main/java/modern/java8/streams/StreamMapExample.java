package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> namesList(){
        List<String> studentList =
         StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                //Student as an input -> Student name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //uppercase operation
                .collect(Collectors.toList());
        return studentList;
    }

    public static Set<String> namesSet(){
        Set<String> studentSet =
                StudentDataBase.getAllStudents()
                        .stream() //Stream<Student>
                        //Student as an input -> Student name
                        .map(Student::getName) //Stream<String>
                        .map(String::toUpperCase) //uppercase operation
                        .collect(Collectors.toSet());
        return studentSet;
    }
    public static void main(String[] args) {

        System.out.println(namesList());

        System.out.println(namesSet());
    }
}
