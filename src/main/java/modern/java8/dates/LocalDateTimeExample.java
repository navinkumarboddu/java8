package modern.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 03, 01, 05, 05, 05, 978);
        System.out.println("LocalDateTime1 : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("LocalDateTime2 : " + localDateTime2);

        /**
         * Getting time and date from LocalDateTime instance
         */
        System.out.println("Hour : " + localDateTime.getHour());
        System.out.println("Minutes : " + localDateTime.getMinute());
        System.out.println("Day : " + localDateTime.getDayOfMonth());
        System.out.println("Day : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying LocalDateTime
         */
        System.out.println("plus hour : " + localDateTime.plusHours(2));
        System.out.println("minus Days : " + localDateTime.minusDays(2));
        System.out.println("withMonth : " + localDateTime.withMonth(2));

        /**
         * converting localdate, localtime to localdatetime and viceversa
         */
        LocalDate localDate = LocalDate.of(2019,01,01);
        System.out.println("atTime : " + localDate.atTime(23,33));

        LocalTime localTime = LocalTime.of(23,59);
        System.out.println("atDate :"  + localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate : " + localDateTime3.toLocalDate());
        System.out.println("toLocalTime : " + localDateTime3.toLocalTime());
    }
}