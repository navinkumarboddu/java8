package modern.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {
        //localDate
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate : " + localDate);

        //localTime
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        //localDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);
    }
}
