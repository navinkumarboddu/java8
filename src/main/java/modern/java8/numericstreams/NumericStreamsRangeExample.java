package modern.java8.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangeExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Range Count :" + intStream.count());

        IntStream.range(1,50).forEach(v -> System.out.print(v + ","));
        System.out.println();
        System.out.println("RangeClosed Count :" + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(v -> System.out.print(v + ","));
        System.out.println();
        System.out.println("Long Stream Range Closed Count :" + IntStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(v -> System.out.print(v + ","));

        System.out.println();
        System.out.println("Double Stream Range using IntStream Count :" + IntStream.rangeClosed(1,50).count());
        IntStream.range(1,50).asDoubleStream().forEach(v -> System.out.print(v + ","));
    }
}
