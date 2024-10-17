package modern.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        names.remove(0);
        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //Stream can be travsed only once
        //nameStream.forEach(System.out::println);
    }
}
