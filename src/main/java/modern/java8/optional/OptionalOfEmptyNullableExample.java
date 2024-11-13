package modern.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        return Optional.ofNullable("Hello");
    }

    public static void main(String[] args) {
        System.out.println(ofNullable());
    }
}
