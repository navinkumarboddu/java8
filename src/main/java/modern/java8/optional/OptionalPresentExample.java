package modern.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void isPresent(){
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());
    }

    public static void main(String[] args) {
        isPresent();
    }
}
