package com.java8.modern.v2.enhancedswitch;

import java.time.Month;
import java.time.Year;

public class DaysinMonth {

    public static int getDays(Month month, int year){
        int noOfDays = 0;
        switch (month){
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays=30;
                break;
            case FEBRUARY:
                System.out.println("Checking if " + year + " is a leap year");
                noOfDays = Year.isLeap(year) ? 29 : 28;
                break;
            default:
                noOfDays = 31;
        }
        return noOfDays;
    }

    public static void main(String[] args) {
        getDays(Month.APRIL, 2029);
    }
}
