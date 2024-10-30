package modern.java8.streams_terminal;

import modern.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("count : " + count());
    }
}
