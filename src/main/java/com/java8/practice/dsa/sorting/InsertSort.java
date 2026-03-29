package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int []arr = {4,5,1,2,3};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        //int []arr1 = {1,2,3,4,5};
        //insertionSort(arr1);
        //Arrays.stream(arr1).forEach(System.out::println);

    }

    private static void insertionSort(int[] arr) {
        if (arr == null || arr.length <=2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(j,j-1,arr);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int i0, int i1, int[] array) {
        int temp = array[i0];
        array[i0] = array[i1];
        array[i1] = temp;
    }
}
