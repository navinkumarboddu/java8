package modern.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {

    //primitive to wrapper
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    //wrapper to primitive
    public static int unBoxing(List<Integer> integerList){
       return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("UnBoxing : " + unBoxing(integerList));
    }
}
