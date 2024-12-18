package modern.java8.dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        System.out.println("CustomDate : " + LocalDate.of(2018,07,17));

        System.out.println("Day of Year : " + LocalDate.ofYearDay(2018,365));

        /**
         * Get values from LocalDate
         */
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());


        /**
         * Modifying LocalDate
         */
        System.out.println("plusDays : " + localDate.plusDays(2));
        System.out.println("plusMonths : " + localDate.plusMonths(2));
        System.out.println("minusDays : " + localDate.minusDays(2));

        System.out.println("with Year : " + localDate.withYear(2019));
        System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2020));
        System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("chronounit minus year : " + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Additional Support Methods
         */
        System.out.println("Leap Year Check : " + LocalDate.ofYearDay(2020,01). isLeapYear());

        LocalDate localDate1 = LocalDate.of(2025,01,02);
        System.out.println("Dates Equality : " + localDate.isEqual(localDate1));
        System.out.println("Dates Before : " + localDate.isBefore(localDate1));
        System.out.println("Dates After : " + localDate1.isAfter(localDate));

        /**
         * Unsupported
         */
        //System.out.println("chronounit minus year : " + localDate.minus(1, ChronoUnit.MINUTES));
        //time functionality is not applicable on date

        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));
    }
}
