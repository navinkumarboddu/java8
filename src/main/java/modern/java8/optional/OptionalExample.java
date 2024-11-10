package modern.java8.optional;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class OptionalExample {

    public static String getStudentName(){
         //Student student = StudentDataBase.studentSupplier.get();
         Student student = null;
         if(student != null){
             return student.getName();
         }
         return null;
    }

    public static void main(String[] args) {
        String name = getStudentName();
        System.out.println("Length of the student name : " + name.length());
    }
}
