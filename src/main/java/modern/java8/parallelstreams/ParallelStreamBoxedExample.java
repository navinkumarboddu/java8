package modern.java8.parallelstreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());
    }
}
