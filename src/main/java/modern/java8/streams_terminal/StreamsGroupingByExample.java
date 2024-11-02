package modern.java8.streams_terminal;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.IntSummaryStatistics;
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

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        //groupStudentsByGender();
        //customizedGroupBy();
        //twoLevelGrouping_1();
        twoLevelGrouping_2();
    }
}
