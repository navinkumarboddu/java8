package arrays.coding;

public class ArrayExample01 {

    public static void main(String[] args) {
        int[] numbers;
        int numbers2[];

        numbers = new int[4];
        numbers[3]=4;
        numbers[2]=2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        numbers2 = new int[]{2,4,6,8};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        int[] empty = new int[0]; //empty array
        int[] empty2 = {};

        //int[] lotsOfNumbers = new int[Integer.MAX_VALUE];
        // java.lang.OutOfMemoryError: Requested array size exceeds VM limit
    }
}
