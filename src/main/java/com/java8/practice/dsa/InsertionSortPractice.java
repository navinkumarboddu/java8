package com.java8.practice.dsa;

import java.util.Arrays;

public class InsertionSortPractice {

    public static void main(String[] args) {
        int[] arr = {4,15,5,1,3,6,13};
        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j-1] > arr[j]){
                    swap(j-1,j,arr);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
