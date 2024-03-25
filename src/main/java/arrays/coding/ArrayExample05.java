package arrays.coding;

import java.util.Scanner;

public class ArrayExample05 {

    public static void main(String[] args) {
        int[] numbers = {15,23,45,56};
        String[] names = {"Jack", "Jill", "Jimmy","John"};

        String cls1 = numbers.getClass().getName();
        String cls2 = names.getClass().getName();

        System.out.println(cls1);
        System.out.println(cls2);
    }
}
