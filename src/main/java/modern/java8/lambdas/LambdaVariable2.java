package modern.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    public static void main(String[] args) {
        int value = 4;

        Consumer<Integer> c1 = (i) -> {
            //value++; //Variable used in lambda expression should be final or effectively final
            System.out.println(value + i);
        };

        //value = 6; //Variable used in lambda expression should be final or effectively final
        c1.accept(value);
    }
}
