package modern.java8.numericstreams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(0,0).max();

        System.out.println(IntStream.rangeClosed(0,0).count());

        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);
        //System.out.println("Max value is :" + optionalInt);
    }
}
