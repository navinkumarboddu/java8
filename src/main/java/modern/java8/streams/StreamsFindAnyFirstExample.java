package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if(studentOptionalFindAny.isPresent()){
            System.out.println("Found the student : " + studentOptionalFindAny.get());
        } else {
            System.out.println("Student not found");
        }
    }
}
