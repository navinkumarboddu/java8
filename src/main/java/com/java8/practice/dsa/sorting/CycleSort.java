package com.java8.practice.dsa.sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void cycleSort(int[] arr) {
        int  i = 0;
        while(i < arr.length) {
            int val = arr[i];
            int index = val - 1;
            if(arr[i] != arr[index]){
                swap(i,index,arr);
            } else {
                i++;
            }
        }
    }

    private static void swap(int i, int val, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[val];
        arr[val] = temp;
    }
}
