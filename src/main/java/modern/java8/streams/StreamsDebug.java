package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDebug {

    public static void main(String[] args) {
        //student and list of activities in a map
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                }) //to debug the streams
                .filter(studentGradePredicate)
                .peek(student -> {
                    System.out.println("After 1st Filter" + student);
                })
                .filter(getStudentGpaPredicate)
                .peek(student -> {
                    System.out.println("After 2nd Filter" + student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }

    static Predicate<Student> studentGradePredicate = (student -> student.getGradeLevel() >= 3);
    static Predicate<Student> getStudentGpaPredicate = (student -> student.getGpa() >= 3.9);
}
