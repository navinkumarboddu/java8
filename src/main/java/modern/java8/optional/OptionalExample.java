package modern.java8.optional;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){
         Student student = StudentDataBase.studentSupplier.get();
         //Student student = null;
         if(student != null){
             return student.getName();
         }
         return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        System.out.println("Length of the student name : " + name.length());

        Optional<String> studentOptional = getStudentNameOptional();
        if(studentOptional.isPresent()){
            System.out.println("Length of the student name : " + studentOptional.get().length());
        }
    }
}
