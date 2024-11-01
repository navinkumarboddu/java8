package modern.java8.streams_terminal;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender(){
        Map<String,List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupBy(){
        Map<String,List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> { return student.getGpa()>=3.8 ? "Outstanding" : "Average";}));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupBy();
    }
}
