package modern.java8.streams;

import modern.java8.data.Student;
import modern.java8.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b) -> a+b);
                .reduce(0, Integer::sum);
    }

    private static int noOfNoteBooksOfGradeAbove3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b) -> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("No of Books of all students: " + noOfNoteBooks());

        System.out.println("No of Books of all students of Grade above 3: " + noOfNoteBooksOfGradeAbove3());
    }
}
