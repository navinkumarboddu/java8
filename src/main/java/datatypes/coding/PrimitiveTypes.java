package datatypes.coding;

public class PrimitiveTypes {

    public static void main(String[] args) {
        int counter;
        counter = 0;

        int anotherCounter = 5;
        counter = counter + anotherCounter;
        System.out.println("Counter : " + counter);

        int firstNumber = 25;
        int secondNumber;

        System.out.println(firstNumber);
        secondNumber = 6;
        System.out.println(secondNumber);

        short day=1, month =2, year = 2000;
        System.out.println(day + "/" + month + "/" + year);

        char firstNameInitial = 'A';
        System.out.println(firstNameInitial);

        boolean isThisTrue = true;
        System.out.println(isThisTrue);

        //int for = 0; not allowed - keyword
        //int 1number = 5; should start with letter
        int a1number = 5;

        float myFloatNumber = 1.1F;

    }
}
