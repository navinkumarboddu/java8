package modern.java8.dates;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        LocalTime localTime1 = LocalTime.of(23,23);
        System.out.println("LocalTime1 : " + localTime1);
    }
}
