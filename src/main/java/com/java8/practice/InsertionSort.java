package com.java8.practice;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr =  {5,1,4,2,8};
        insertionSorte(arr);
        System.out.println("Insertion sort");
        Arrays.stream(arr).forEach(System.out::println);

        arr = new int[]{5,1,4,2,8};
        bubbleSorte(arr);
        System.out.println("Bubble sort");
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubbleSorte(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length -1; j++) {
                if(arr[j-1] > arr[j]){
                    swap(j-1,j,arr);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void insertionSorte(int[] arr) {
        if(arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i+1; j > i ; j--) {
                    if(arr[j-1] > arr[j]){
                        swap(j-1,j,arr);
                    }
                }
            }
        }
    }

    private static void swap(int j, int i, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
