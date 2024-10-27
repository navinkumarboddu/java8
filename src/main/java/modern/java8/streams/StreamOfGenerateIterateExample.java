package modern.java8.streams;

import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("navin","ramesh","ganesh");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
