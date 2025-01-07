package modern.java8.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018,01,01);
        LocalDate localDate1 = LocalDate.of(2018,12,31);

        /**
         *
         */
        Period period = localDate.until(localDate1);
        System.out.println("getDays : " + period.getDays());
    }
}
