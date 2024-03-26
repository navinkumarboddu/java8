package arrays.coding;

import java.util.Arrays;

public class ArrayExample07 {

    public static void main(String[] args) {
        int[] numbers1 = {15,23,45,56};

        int[] numbers2 = Arrays.copyOf(numbers1, 6);

        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = Arrays.copyOfRange(numbers1, 0,3);
        System.out.println(Arrays.toString(numbers3));

        int[] numbers4 = new int[6];
        System.arraycopy(numbers2,0, numbers4, 0,3);
        System.out.println(Arrays.toString(numbers4));

        int index = Arrays.binarySearch(numbers4, 23);
        System.out.println("Found 23 at index : " + index);
    }
}
