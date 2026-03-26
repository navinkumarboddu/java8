package com.java8.practice.dsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int []arr = {4,5,1,2,3};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        int []arr1 = {1,2,3,4,5};
        bubbleSort(arr1);
        Arrays.stream(arr1).forEach(System.out::println);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            //System.out.println(arr[i]);
            for (int j = 1; j < arr.length - i; j++) {
                //System.out.println("j:" + arr[j]);
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.println("Broke");
                break;
            }
        }

    }
}
