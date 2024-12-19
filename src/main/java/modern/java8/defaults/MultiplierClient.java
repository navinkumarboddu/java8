package modern.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        System.out.println("Multiplication : " + multiplier.multiply(integerList));
    }
}
