package modern.java8.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, (x,y) -> x + y);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the sequentialSum : " + (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(Collectors.toList());
    }
}
