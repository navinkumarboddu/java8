package modern.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        /**
         * Sort the list names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Namesh","Duggu","Nimish","Suresh","Ramesh");

        /**
         * Prior Java 8
         */
        //Collections.sort(stringList);
        //System.out.println("Sort List using Collections.Sort() : " + stringList);

        /**
         * Java 8
         */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sort List using List.Sort() : " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sort List using List.Sort() : " + stringList);
    }
}
