package arrays.coding;

import java.util.Arrays;

public class ArrayExample06 {

    public static void main(String[] args) {
        int[] numbers1 = {15,23,45,56};
        int[] numbers2 = {15,23,45,56};

        boolean result = numbers1.equals(numbers2);
        System.out.println("Are they equal? " + result);

        result = Arrays.equals(numbers1, numbers2);
        System.out.println("Are they equal? " + result);
    }
}
