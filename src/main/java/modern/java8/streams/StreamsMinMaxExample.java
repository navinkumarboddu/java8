package modern.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //.reduce(0, (a,b) -> a > b ? a : b);
                .reduce(Integer::max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("Max value:" + findMaxValue(integerList));
        System.out.println("Max value:" + findMaxValue(integerList).get());
    }
}
