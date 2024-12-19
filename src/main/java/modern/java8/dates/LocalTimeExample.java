package modern.java8.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        LocalTime localTime1 = LocalTime.of(23,23);
        System.out.println("LocalTime1 : " + localTime1);

        LocalTime localTime2 = LocalTime.of(23,33,33);
        System.out.println("LocalTime2 : " + localTime2);

        LocalTime localTime3 = LocalTime.of(23,33,33,980980980);
        System.out.println("LocalTime3 : " + localTime3);

        /**
         * getting the values from local time instance
         */
        System.out.println("Current Hour : " + localTime.getHour());
        System.out.println("getMinute : " + localTime.getMinute());

        System.out.println("Clock hour : "+  localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("Seconds : "+  localTime.toSecondOfDay());

        /**
         * Modify the values of LocalTime
         */
        System.out.println("minus 2 hours : " + localTime.minusHours(2));
        System.out.println("Chronounit minus 2 hours : " + localTime.minus(2,ChronoUnit.HOURS));

        System.out.println("MIDNIGHT : " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("MIDNIGHT : " + localTime.with(ChronoField.HOUR_OF_DAY, 22));

        System.out.println("plusMinutes : " + localTime.plusMinutes(30));
        System.out.println("withHour : " + localTime.withHour(10));
    }
}
