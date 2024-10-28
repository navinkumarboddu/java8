package modern.java8.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : " + sum);
    }
}
