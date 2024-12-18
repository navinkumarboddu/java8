package modern.java8.dates;

import java.time.LocalTime;

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
    }
}
