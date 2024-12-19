package modern.java8.dates;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 03, 01, 05, 05, 05, 978);
        System.out.println("LocalDateTime1 : " + localDateTime1);
    }
}
