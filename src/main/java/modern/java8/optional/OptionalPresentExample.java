package modern.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void isPresent(){
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }

    public static void ifPresent(){
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        isPresent();
        ifPresent();
    }
}
