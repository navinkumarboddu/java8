package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //sortByName
        System.out.println("Students sorted by Name:");
        sortStudentsByName().forEach(System.out::println);

        //sortByGpa
        System.out.println("Students sorted by Gpa:");
        sortStudentsByGpa().forEach(System.out::println);

        //sortByGpaDesc
        System.out.println("Students sorted by Gpa DESC:");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
