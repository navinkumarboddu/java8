package arrays.coding;

public class ArrayExample03 {

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8};

        for (int i = 0; i < 4; i++) {
            int element = numbers[i];
            System.out.println("The element at index " + i + " is: " + element);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum : " + sum);

        sum = 0;
        for (int i: numbers){
            sum += i;
        }
        System.out.println("Sum : " + sum);

    }
}
