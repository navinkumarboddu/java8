package modern.java8.defaults;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    public static void sortByName(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);

        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);

        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //System.out.println(studentList);

        System.out.println("Before sort");
        studentList.forEach(studentConsumer);

        //sortByName(studentList);
        sortByGpa(studentList);
    }
}
