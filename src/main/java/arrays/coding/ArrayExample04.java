package arrays.coding;

import java.util.Scanner;

public class ArrayExample04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter : ");

        int count = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number : ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for(int i : numbers){
            System.out.println(i);
        }
    }
}
