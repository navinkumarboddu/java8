package com.java8.practice.dsa;

import java.util.Arrays;

public class BubbleSortWithWhileLoop {

    public static void main(String[] args) {
        int[] array = {12, 35, 87, 26, 9, 28, 7};
        bubbleSort(array);
        System.out.println("Sorted array: "  + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        if(array == null || array.length < 2){
            return;
        }
        int n = array.length;
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for (int i = 1; i < n; i++) {
                if(array[i-1] > array[i]){
                    swap(i-1,i,array);
                    System.out.println(array[i]);
                    swapped = true;
                }
            }
            n--;
        }
    }

    private static void swap(int i0, int i1, int[] array) {
        int temp = array[i0];
        array[i0] = array[i1];
        array[i1] = temp;
    }
}
