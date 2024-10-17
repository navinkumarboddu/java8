package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        //student and list of activities in a map
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(studentGradePredicate)
                .filter(getStudentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }

    static Predicate<Student> studentGradePredicate = (student -> student.getGradeLevel() >= 3);
    static Predicate<Student> getStudentGpaPredicate = (student -> student.getGpa() >= 3.9);
}
