package modern.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMulitplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMulitplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println("Multiplication ::" + performMulitplication(integers));

        Optional<Integer> result = performMulitplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println("Multiplication ::" + result.get());

        List<Integer> integers1 = new ArrayList<>();
        Optional<Integer> result1 = performMulitplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());
        if(result1.isPresent()){
            System.out.println(result1.get());
        }
    }
}