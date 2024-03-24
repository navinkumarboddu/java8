package operators.coding;

import java.time.Month;

public class ConditionalLogicExamples {

    public static void main(String[] args) {

        if (0 == 0)
            System.out.println("True");

        if (false)
            System.out.println("True");
        System.out.println("False");

        if (false) {
            System.out.println("True");
            System.out.println("False");
        }

        if (false) {
            System.out.println("False");
        } else if (true) {
            System.out.println("True");
        }

        int x = 5 > 4 ? 1 : 2; //1
        int y = 5 < 4 ? 1 : 2; //2
        System.out.println(x + "," + y);

        Month month = Month.JUNE;
        switch (month){
            case DECEMBER:
                System.out.println("Winter");
                break;
            case APRIL:
                System.out.println("Spring");
                break;
            case JUNE:
                System.out.println("Summer");
                break;
        }

        month = Month.JUNE;
        switch (month){
            case DECEMBER:
                System.out.println("Winter");
                break;
            case APRIL:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Oops");
                break;
        }

        month = Month.APRIL;
        switch (month){
            case DECEMBER:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Oops");
                break;
            case APRIL:
                System.out.println("Spring");
                break;
        }

        month = Month.JUNE;
        switch (month){
            case JUNE:
                System.out.println("Summer");
            default:
                System.out.println("Oops");
            case APRIL:
                System.out.println("Spring");
                break;
        }

        month = Month.JUNE;
        switch (month){
            default:
                System.out.println("Oops");
            case JUNE:
                System.out.println("Summer");
            case APRIL:
                System.out.println("Spring");
                break;
        }
    }
}
