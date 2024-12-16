package modern.java8.dates;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        System.out.println("CustomDate : " + LocalDate.of(2018,07,17));
    }
}
