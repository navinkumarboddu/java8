package modern.java8.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamsRangeExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range Count :" + intStream.count());

        IntStream.range(1,50).forEach(v -> System.out.println(v + ","));

        System.out.println("RangeClosed Count :" + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(v -> System.out.println(v + ","));
    }
}
