package modern.java8.streams;

import modern.java8.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static void main(String[] args) {
        System.out.println("Result of allMatch(): " + allMatch());


    }
}
