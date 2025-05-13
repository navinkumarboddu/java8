package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Comparator;
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
        System.out.println("printStudentActivites :: " + printStudentActivities());

        System.out.println("printStudentActivites Distinct :: ");
        printStudentActivities().stream().distinct().forEach(System.out::println);

        System.out.println("printStudentActivites Distinct count :: ");
        System.out.println(printStudentActivities().stream().distinct().count());

        System.out.println("printStudentActivites Sorted :: ");
        printStudentActivities().stream().distinct().sorted().forEach(System.out::println);

        System.out.println("printStudentActivites Reverse :: ");
        printStudentActivities().stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
