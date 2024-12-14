package modern.java8.defaults;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample3 {

    public static void sortWithNullValues(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.nullsFirst(DefaultMethodsExample2.nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(DefaultMethodsExample2.studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        System.out.println("Before sort");

        //sortByName(studentList);
        //sortByGpa(studentList);
        sortWithNullValues(studentList);
    }
}
