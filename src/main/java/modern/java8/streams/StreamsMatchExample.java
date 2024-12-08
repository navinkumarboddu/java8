package modern.java8.streams;

import modern.java8.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() >= 4.1);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa() >= 4.3);
    }

    public static void main(String[] args) {
        System.out.println("Result of allMatch(): " + allMatch());

        System.out.println("Result of anyMatch(): " + anyMatch());

        System.out.println("Result of noneMatch(): " + noneMatch());
    }
}
